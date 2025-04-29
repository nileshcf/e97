package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip65504TagArea extends Ip65504TagAreaSerialized { 
   
				@Getter @Setter private Ip65504TagId ip65504TagId = new Ip65504TagId();

								@Getter @Setter private short ip65504TagSubFldNo;

								@Getter @Setter private short ip65504TagStarts;

								@Getter @Setter private short ip65504TagLngth;

						@Getter @Setter private char[] ip65504TagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip65504TagArea
	**/
    public Ip65504TagArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504TagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp65504TagId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip65504TagArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp65504TagId().initialize();
     
         	setIp65504TagSubFldNo((short)0);
         	setIp65504TagStarts((short)0);
         	setIp65504TagLngth((short)0);
         setIp65504TagStatus(CONSTANTS.SPACE);
   }


}
  
