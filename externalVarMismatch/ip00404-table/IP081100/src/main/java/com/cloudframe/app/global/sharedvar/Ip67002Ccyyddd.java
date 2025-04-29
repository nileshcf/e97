package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Ccyyddd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002Ccyyddd extends Ip67002CcyydddSerialized { 
   

								@Getter @Setter private int ip67002CcJul;
				@Getter @Setter private Ip67002Yyddd ip67002Yyddd = new Ip67002Yyddd();
	
	/**
	* Constructor for Ip67002Ccyyddd
	**/
    public Ip67002Ccyyddd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002Ccyyddd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Ccyyddd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp67002Yyddd().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip67002Ccyyddd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002CcJul(0);
          getIp67002Yyddd().initialize();
     
   }


}
  
