package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404Entry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00404Entry extends Ip00404EntrySerialized { 
   
				@Getter @Setter private Ip00404MpePeRecData ip00404MpePeRecData = new Ip00404MpePeRecData();
				@Getter @Setter private Ip00404MpePeRecDataCs ip00404MpePeRecDataCs = new Ip00404MpePeRecDataCs();
	
	/**
	* Constructor for Ip00404Entry
	**/
    public Ip00404Entry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404Entry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404Entry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00404MpePeRecData().setParent(this,getStartOffset() + 0);
					getIp00404MpePeRecDataCs().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes Ip00404Entry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00404MpePeRecData().initialize();
     
          getIp00404MpePeRecDataCs().initialize();
     
   }


}
  
