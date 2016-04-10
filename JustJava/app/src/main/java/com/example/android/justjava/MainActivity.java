package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.justjava.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantidade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        if (quantidade == 100) {
            Toast.makeText(this, "Você não pode pedir mais do que 100 cafés", Toast.LENGTH_SHORT).show();
            return;
        }
        quantidade = quantidade + 1;
        displayQuantity(quantidade);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
            if (quantidade == 1) {
                Toast.makeText(this, "Você não pode pedir maenos do que 1 café", Toast.LENGTH_SHORT).show();
                return;
            }
        quantidade = quantidade - 1;
        displayQuantity(quantidade);
        
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        EditText camponome = (EditText) findViewById(R.id.nome_campo);
        Editable nomeEditavel = camponome.getText();
        String nome = nomeEditavel.toString();

        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean temChocolate = chocolate.isChecked();

        CheckBox cremeDeChantilly = (CheckBox) findViewById(R.id.creme_de_chantilly);
        boolean temCremeDeChantilly = cremeDeChantilly.isChecked();

        int price = calculatePrice();
        displayMessage(createOrderSummary(price, temCremeDeChantilly, temChocolate, nome));

    }

    /**
     * Calculates the price of the order.
     *
     * @return total price
     */
    private int calculatePrice() {
        int precobase = 5;
        
        if (AddCremeDeChantilly) {
            precobase + 1
        }
        
        if (AddChocolate) {
            precobase + 2;
        }

        return quantidade * precobase;
    }

    /**
     * Create summary the order
     *
     * @param price of the order
     * @return text summary
     * @param addCremeDeChantilly diz se o usuario quer ou não o chantilly
     */
    private String createOrderSummary(int price, boolean addCremeDeChantilly, Boolean addChocolate, String Nome) {

        String priceMessage = "Nome = " + Nome;
        priceMessage += "\nAdd Chocolate? " + addChocolate;
        priceMessage += "\nAdd Creme de Chantilly? " + addCremeDeChantilly;
        priceMessage += "\nQuantidade = " + quantidade;
        priceMessage += "\nTotal R$" + price;
        priceMessage += "\nObrigado!";
        return priceMessage;

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        OrderSummaryTextView.setText(message);
    }
}
