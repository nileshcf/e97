package com.cloudframe.app.cfdate02.file.records;

/**
*  The class Rl001MachToMachInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001MachToMachInfo extends Rl001MachToMachInfoSerialized { 
   

						private char[] rl001PricingTypCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Rl001MachToMachInfo
	**/
    public Rl001MachToMachInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl001MachToMachInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001MachToMachInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rl001PricingTypCd
	 *	@return rl001PricingTypCd
	 */
   public char[] getRl001PricingTypCd() throws CFException{
     if (isRl001PricingTypCdModified()) { 
        rl001PricingTypCd = refreshRl001PricingTypCd();
     }
   		return rl001PricingTypCd;
   }

  
	/**
	*  set variable rl001PricingTypCd
	*  Corresponding COBOL Variable is RL001-PRICING-TYP-CD
	*  @param value
	**/
   public void setRl001PricingTypCd(char[] value) {
      rl001PricingTypCd = checkRl001PricingTypCdConstraints(value);
      serializeRl001PricingTypCd(rl001PricingTypCd);
   } 

     /**
	 * 	Update Rl001PricingTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001PricingTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001PricingTypCd,rl001PricingTypCd.length);
   	
   }
   
   public void setRl001PricingTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingTypCd,rl001PricingTypCd.length);
   	
   }
   
     /**
	 * 	Update Rl001PricingTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001PricingTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001PricingTypCd with another Field
	 *	@param value
	 */
   public void setRl001PricingTypCd(Field source) {
       replace(source,0,source.length(),beginRl001PricingTypCd,RL_001_PRICING_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001PricingTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001PricingTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001PricingTypCd,RL_001_PRICING_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rl001PricingTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001PricingTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingTypCd+targetIndex,targetLen);
    
   }
	char[] rl001BulkMb88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isRl001BulkMb()
	 *	@return  Returns true if isRl001BulkMb() is "B"
	 */
   public boolean isRl001BulkMb() throws CFException {
      return (  compareChars( getRl001PricingTypCd() , rl001BulkMb88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setRl001BulkMbTrue() {  			
    	setRl001PricingTypCd( rl001BulkMb88Value);
   	}
	char[] rl001SuperOffPeak88Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isRl001SuperOffPeak()
	 *	@return  Returns true if isRl001SuperOffPeak() is "S"
	 */
   public boolean isRl001SuperOffPeak() throws CFException {
      return (  compareChars( getRl001PricingTypCd() , rl001SuperOffPeak88Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setRl001SuperOffPeakTrue() {  			
    	setRl001PricingTypCd( rl001SuperOffPeak88Value);
   	}

	
	
	

		public static int getRl001MachToMachInfoFieldLength() {
			return RL_001_MACH_TO_MACH_INFO_LENGTH;
		}

}
  
