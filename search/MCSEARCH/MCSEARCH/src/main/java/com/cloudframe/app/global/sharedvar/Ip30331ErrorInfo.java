package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip30331ErrorInfo extends Ip30331ErrorInfoSerialized { 
   
				@Getter @Setter private Ip30331ErrorIndex ip30331ErrorIndex = new Ip30331ErrorIndex();

								@Getter @Setter private int ip30331ErrorMsgNumber;
	
	/**
	* Constructor for Ip30331ErrorInfo
	**/
    public Ip30331ErrorInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip30331ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp30331ErrorIndex().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip30331ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp30331ErrorIndex().initialize();
     
                     setIp30331ErrorMsgNumber(0);
   }


}
  
