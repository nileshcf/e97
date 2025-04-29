package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1TableEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip2ooo1TableEntries extends Ip2ooo1TableEntriesSerialized { 
   

								@Getter @Setter private int ip2ooo1ErrorType;
				@Getter @Setter private Ip2ooo1ErrorInfo ip2ooo1ErrorInfo = new Ip2ooo1ErrorInfo();
      private List<char[]> ip2ooo1ReplText; 

	
	/**
	* Constructor for Ip2ooo1TableEntries
	**/
    public Ip2ooo1TableEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip2ooo1TableEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1TableEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp2ooo1ErrorInfo().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip2ooo1TableEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp2ooo1ErrorType(0);
          getIp2ooo1ErrorInfo().initialize();
     
         for (int index =0; index < IP_2OOO_1_REPL_TEXT_SIZE;index++) {
             setIp2ooo1ReplText(index, CONSTANTS.SPACE_50);
         }
   }


}
  
