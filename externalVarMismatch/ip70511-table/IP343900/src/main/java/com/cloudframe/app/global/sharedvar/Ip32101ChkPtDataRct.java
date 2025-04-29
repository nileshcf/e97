package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataRct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip32101ChkPtDataRct extends Ip32101ChkPtDataRctSerialized { 
   

								@Getter @Setter private short ip32101RctDataLen;

								@Getter @Setter private long ip32101RctFreq;
				@Getter @Setter private Ip32101RctChkKey ip32101RctChkKey = new Ip32101RctChkKey();

								@Getter @Setter private long ip32101RctSumChkCnt;

								@Getter @Setter private long ip32101RctDtlChkCnt;

								@Getter @Setter private long ip32101RctSetlChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataRct
	**/
    public Ip32101ChkPtDataRct() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101ChkPtDataRct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataRct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp32101RctChkKey().setParent(this,getStartOffset() + 11);
    } 

	/**
	 * 	initializes Ip32101ChkPtDataRct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101RctDataLen((short)0);
                     setIp32101RctFreq(0);
          getIp32101RctChkKey().initialize();
     
                     setIp32101RctSumChkCnt(0);
                     setIp32101RctDtlChkCnt(0);
                     setIp32101RctSetlChkCnt(0);
   }


}
  
