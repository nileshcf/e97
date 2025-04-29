package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataCpt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip32101ChkPtDataCpt extends Ip32101ChkPtDataCptSerialized { 
   

								@Getter @Setter private short ip32101CptDataLen;

								@Getter @Setter private long ip32101CptFreq;
				@Getter @Setter private Ip32101CptChkKey ip32101CptChkKey = new Ip32101CptChkKey();

								@Getter @Setter private long ip32101CptChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataCpt
	**/
    public Ip32101ChkPtDataCpt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101ChkPtDataCpt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCpt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp32101CptChkKey().setParent(this,getStartOffset() + 11);
    } 

	/**
	 * 	initializes Ip32101ChkPtDataCpt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101CptDataLen((short)0);
                     setIp32101CptFreq(0);
          getIp32101CptChkKey().initialize();
     
                     setIp32101CptChkCnt(0);
   }


}
  
