package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip000604DeAttrRow extends Ip000604DeAttrRowSerialized { 
   

								@Getter @Setter private int ip000604DeFirstAb;

						@Getter @Setter private char[] ip000604DeFirstAbRedefined = Field.fillLowValue(4);
				@Getter @Setter private Ip000604DeAttrUserRow ip000604DeAttrUserRow = new Ip000604DeAttrUserRow();
	
	/**
	* Constructor for Ip000604DeAttrRow
	**/
    public Ip000604DeAttrRow() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000604DeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp000604DeAttrUserRow().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Ip000604DeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp000604DeFirstAb(0);
          getIp000604DeAttrUserRow().initialize();
     
   }


}
  
