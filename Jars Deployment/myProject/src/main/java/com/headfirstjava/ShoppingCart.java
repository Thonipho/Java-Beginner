package com.headfirstjava;

import javax.swing.*;

public class ShoppingCart {

    public static void main(String[] args) {
        /**
         * Declaration of variables
         */
        int cokeqty = 0, spriteqty = 0, lindtqty = 0;
        String c = "1 \t Coke \t R10", l = "2 \t Lindt \t R20", s = "3 \t Sprite \t R11";
        String menusetup = "ID \t Item \t Price \n";
        String cartsetup = "Item \t Price \t Quantity \t TotalPrice\n";
        String cokecart = null, lindtcart = null, spritecart = null;
        double cokeprice = 10, lindtprice = 20, spriteprice = 30;
        double coketotal = 0, lindttotal = 0, spritetotal = 0;
        /**
         * Introduction to application and support for while loop
         */
        int shop = Integer.parseInt(JOptionPane.showInputDialog(null, "- Enter any value to display menu " + "\n" + "\n- Enter 99 to cancel"));
        /**
         * While loop will keep the menu popping up until user requests to
         * checkout
         */
        while (shop != 99) {

            /**
             * if statement that quits the operation if user chooses to cancel
             */
            if (shop == 99) {
                break;
            }
            /**
             * Input box that will display menu and offer the user items to
             * select
             */
            int cart = Integer.parseInt(JOptionPane.showInputDialog(null,
                    menusetup + "\n" + c + "\n" + l + "\n" + s + "\n"
                    + "\n Add item to cart by selecting ID" + "\n"
                    + "\n Enter 99 to checkout"));
            /**
             * if statement that will set the conditions if user selects item 1
             */
            if (cart == 1) {
                cokeqty = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many Cokes would you like?"));
                coketotal = cokeprice * cokeqty;
                cokecart = "Coke" + "    " + cokeprice + "    " + cokeqty
                        + "            " + coketotal;
                JOptionPane.showMessageDialog(null, cartsetup + "\n" + cokecart);

            }
            /**
             * if statement that will set the conditions if user selects item 2
             */
            if (cart == 2) {
                lindtqty = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many Lindts would you like?"));

                lindttotal = lindtprice * lindtqty;
                lindtcart = "Lindt" + "    " + lindtprice + "    " + lindtqty
                        + "            " + lindttotal;
                JOptionPane.showMessageDialog(null, cartsetup + "\n" + lindtcart);
            }
            /**
             * if statement that will set the conditions if user selects item 3
             */
            if (cart == 3) {
                spriteqty = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many Sprites would you like?"));

                spritetotal = spriteprice * spriteqty;
                spritecart = "Sprite" + "    " + spriteprice + "    " + spriteqty
                        + "            " + spritetotal;
                JOptionPane.showMessageDialog(null, cartsetup + "\n" + spritecart);
            }
            /**
             * if statement that will generate the invoice
             */
            if (cart == 99) {
                double grandtotal = coketotal + lindttotal + spritetotal;
                JOptionPane.showMessageDialog(null, "INVOICE" + "\n" + "\n" + cartsetup + "\n"
                        + cokecart + "\n" + lindtcart + "\n" + spritecart + "\n" + "\nGrand Total:" + "     " + grandtotal);
                break;
            }

        }

    }

}
/**
 * Source Code developed by Thonipho Mavhungu
 */
