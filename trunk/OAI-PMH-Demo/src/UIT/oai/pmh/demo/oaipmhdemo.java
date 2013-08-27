/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UIT.oai.pmh.demo;

import ORG.oclc.oai.harvester2.app.RawWrite;
import java.io.OutputStream;

/**
 *
 * @author THNghiep
 */
public class oaipmhdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        demoCiteseerX();
    }
    
    /**
     * demoCiteseerX
     * List all records from CiteseerX and print out.
     */
    public static void demoCiteseerX() {
        try {
            // Output to standard System.out
            OutputStream out = System.out;
            // Use run in RawWrite
            // Base url is documented in dropbox\docs
            // For demo purpose, not specify from and until date
            // metadata format is Dublin core
            // In CiteseerX, set is null
            RawWrite.run("http://citeseerx.ist.psu.edu/oai2", null, null, "oai_dc", null, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
