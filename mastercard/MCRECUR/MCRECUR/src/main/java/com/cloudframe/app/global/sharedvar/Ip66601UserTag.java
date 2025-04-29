package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601UserTag is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip66601UserTag extends Ip66601UserTagSerialized { 
   
				@Getter @Setter private Ip66601UserTagId ip66601UserTagId = new Ip66601UserTagId();

								@Getter @Setter private short ip66601UserTagStart;

								@Getter @Setter private short ip66601UserTagLngth;

						@Getter @Setter private char[] ip66601UserTagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66601UserTag
	**/
    public Ip66601UserTag() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66601UserTag. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTag(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp66601UserTagId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip66601UserTag
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp66601UserTagId().initialize();
     
         	setIp66601UserTagStart((short)0);
         	setIp66601UserTagLngth((short)0);
         setIp66601UserTagStatus(CONSTANTS.SPACE);
   }


}
  
