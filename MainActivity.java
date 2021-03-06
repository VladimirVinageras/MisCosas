package ru.nice_solutions.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       /** TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        int quantity = Integer.parseInt(quantityTextView.getText().toString()); */
        display(quantity);
        displayPrice(quantity * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number) {
      /*TextView priceTextView = (TextView) findViewById(
                R.id.price_text_view);

        priceTextView.setText("Total: "number * 10 + " RUB");*/
        String priceMessage = "Free \nThanks you";
        displayMessage(priceMessage);
    }

    public void increment(View view) {
  /**      TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        int quantity = Integer.parseInt(quantityTextView.getText().toString()); */
        int increment = ++quantity;
        display(increment);
    }

    public void decrement(View view) {
   /**     TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        int quantity = Integer.parseInt(quantityTextView.getText().toString()); */
        int decrement = 0;
        if (quantity > 0) {
            decrement = --quantity;
        }
        display(decrement);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}