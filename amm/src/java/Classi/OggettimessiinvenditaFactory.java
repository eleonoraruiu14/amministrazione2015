/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classi;

import java.util.ArrayList;

public class OggettimessiinvenditaFactory {
    private static OggettimessiinvenditaFactory singleton;
    public static OggettimessiinvenditaFactory getInstance() {
        if (singleton == null) {
            singleton = new OggettimessiinvenditaFactory();
        }
        return singleton;
}

}
    



