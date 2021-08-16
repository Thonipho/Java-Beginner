/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterSix;

/**
 *
 * @author User
 */
public class Block {

    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    //return true if ob defines the same block
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }

    //return true if ob has the same volume
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}
