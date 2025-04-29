package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgDtlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip40004IntMsgDtlRec extends Ip40004IntMsgDtlRecSerialized { 
   
				@Getter @Setter private Ip40004MsgDatax ip40004MsgDatax = new Ip40004MsgDatax();
				@Getter @Setter private Ip40004MsgData ip40004MsgData = new Ip40004MsgData();
	
	/**
	* Constructor for Ip40004IntMsgDtlRec
	**/
    public Ip40004IntMsgDtlRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004IntMsgDtlRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004IntMsgDtlRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp40004MsgDatax().setParent(this,getStartOffset() + 0);
					getIp40004MsgData().setParent(this,getStartOffset() + 613);
    } 

	/**
	 * 	initializes Ip40004IntMsgDtlRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp40004MsgDatax().initialize();
     
          getIp40004MsgData().initialize();
     
   }


}
  
