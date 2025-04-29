package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102NormalIpmMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip66102NormalIpmMsg extends Ip66102NormalIpmMsgSerialized { 
   

						@Getter @Setter private char[] ip66102Mti = Field.fillLowValue(4);
				@Getter @Setter private Ip66102BitMap ip66102BitMap = new Ip66102BitMap();

	
	/**
	* Constructor for Ip66102NormalIpmMsg
	**/
    public Ip66102NormalIpmMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66102NormalIpmMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp66102BitMap().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Ip66102NormalIpmMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102Mti(CONSTANTS.SPACE_4);
          getIp66102BitMap().initialize();
     
   }


}
  
