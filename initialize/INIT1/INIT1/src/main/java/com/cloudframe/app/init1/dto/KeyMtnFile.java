package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnFile is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyMtnFile extends KeyMtnFileSerialized { 
   
				@Getter @Setter private KeyMtnCustAcct keyMtnCustAcct = new KeyMtnCustAcct();
				@Getter @Setter private KeyMtnMtn keyMtnMtn = new KeyMtnMtn();
	
	/**
	* Constructor for KeyMtnFile
	**/
    public KeyMtnFile() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyMtnFile. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnFile(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getKeyMtnCustAcct().setParent(this,getStartOffset() + 0);
					getKeyMtnMtn().setParent(this,getStartOffset() + 8);
    } 

	/**
	 * 	initializes KeyMtnFile
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getKeyMtnCustAcct().initialize();
     
          getKeyMtnMtn().initialize();
     
   }


}
  
