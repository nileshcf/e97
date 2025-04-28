package com.cloudframe.app.init1.dto;

/**
*  The class Rl001CustomerDetailRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001CustomerDetailRec extends Rl001CustomerDetailRecSerialized { 
   

						private char[] rl001VbmCustInd = new char[1];
				private Rl001MachToMachInfo rl001MachToMachInfo = new Rl001MachToMachInfo();

						private char[] rl001MachToMachInfoRedefined = Field.fillLowValue(2);

						private char[] rl001PricingLabInd = new char[1];

						private char[] rl001FirstBillInd = new char[1];
	
	/**
	* Constructor for Rl001CustomerDetailRec
	**/
    public Rl001CustomerDetailRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl001CustomerDetailRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001CustomerDetailRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rl001MachToMachInfo.setParent(this,getStartOffset() + 173);
								setRl001VbmCustInd(("N").toCharArray());
								setRl001PricingLabInd(fillSpace(1));
								setRl001FirstBillInd(("N").toCharArray());
    } 

	/**
	 *	Returns the value of rl001VbmCustInd
	 *	@return rl001VbmCustInd
	 */
   public char[] getRl001VbmCustInd() throws CFException{
     if (isRl001VbmCustIndModified()) { 
        rl001VbmCustInd = refreshRl001VbmCustInd();
     }
   		return rl001VbmCustInd;
   }

  
	/**
	*  set variable rl001VbmCustInd
	*  Corresponding COBOL Variable is RL001-VBM-CUST-IND
	*  @param value
	**/
   public void setRl001VbmCustInd(char[] value) {
      rl001VbmCustInd = checkRl001VbmCustIndConstraints(value);
      serializeRl001VbmCustInd(rl001VbmCustInd);
   } 

     /**
	 * 	Update Rl001VbmCustInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001VbmCustInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001VbmCustInd,rl001VbmCustInd.length);
   	
   }
   
   public void setRl001VbmCustInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001VbmCustInd,rl001VbmCustInd.length);
   	
   }
   
     /**
	 * 	Update Rl001VbmCustInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001VbmCustInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001VbmCustInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001VbmCustInd with another Field
	 *	@param value
	 */
   public void setRl001VbmCustInd(Field source) {
       replace(source,0,source.length(),beginRl001VbmCustInd,RL_001_VBM_CUST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001VbmCustInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001VbmCustInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001VbmCustInd,RL_001_VBM_CUST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rl001VbmCustInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001VbmCustInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001VbmCustInd+targetIndex,targetLen);
    
   }
	char[] rl001VbmCust88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRl001VbmCust()
	 *	@return  Returns true if isRl001VbmCust() is "Y"
	 */
   public boolean isRl001VbmCust() throws CFException {
      return (  compareChars( getRl001VbmCustInd() , rl001VbmCust88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRl001VbmCustTrue() {  			
    	setRl001VbmCustInd( rl001VbmCust88Value);
   	}
	char[] rl001NotVbmCust88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRl001NotVbmCust()
	 *	@return  Returns true if isRl001NotVbmCust() is "N"
	 */
   public boolean isRl001NotVbmCust() throws CFException {
      return (  compareChars( getRl001VbmCustInd() , rl001NotVbmCust88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRl001NotVbmCustTrue() {  			
    	setRl001VbmCustInd( rl001NotVbmCust88Value);
   	}
	/**
	 *	Returns the value of rl001MachToMachInfo
	 *	@return rl001MachToMachInfo
	 */   
	 public Rl001MachToMachInfo getRl001MachToMachInfo() {
   	return rl001MachToMachInfo;
   }
   /**
	* 	Update Rl001MachToMachInfo with the passed value
	*   Corresponding COBOL Variable is RL001-MACH-TO-MACH-INFO
	*	@param value
	*/
   public void setRl001MachToMachInfo(char[] value) {
      rl001MachToMachInfo.setString(value); 
   }   
    
     /**
	 * 	Update Rl001MachToMachInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl001MachToMachInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001MachToMachInfo.begin,rl001MachToMachInfo.length());
   }
   
     /**
	 * 	Update Rl001MachToMachInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001MachToMachInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001MachToMachInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl001MachToMachInfo with another Field
	 *	@param value
	 */
   public void setRl001MachToMachInfo(Field source) {
   	replace(source,0,source.length(),rl001MachToMachInfo.begin,rl001MachToMachInfo.length());
   }  
   
     /**
	 * 	Update Rl001MachToMachInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl001MachToMachInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001MachToMachInfo.begin,rl001MachToMachInfo.length());
   }
   
     /**
	 * 	Update Rl001MachToMachInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001MachToMachInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001MachToMachInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rl001MachToMachInfoRedefined
	 *	@return rl001MachToMachInfoRedefined
	 */
   public char[] getRl001MachToMachInfoRedefined() throws CFException{
     if (isRl001MachToMachInfoRedefinedModified()) { 
        rl001MachToMachInfoRedefined = refreshRl001MachToMachInfoRedefined();
     }
   		return rl001MachToMachInfoRedefined;
   }

  
	/**
	*  set variable rl001MachToMachInfoRedefined
	*  Corresponding COBOL Variable is RL001-MACH-TO-MACH-INFO-REDEFINED
	*  @param value
	**/
   public void setRl001MachToMachInfoRedefined(char[] value) {
      rl001MachToMachInfoRedefined = checkRl001MachToMachInfoRedefinedConstraints(value);
      serializeRl001MachToMachInfoRedefined(rl001MachToMachInfoRedefined);
   } 

     /**
	 * 	Update Rl001MachToMachInfoRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001MachToMachInfoRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001MachToMachInfoRedefined,rl001MachToMachInfoRedefined.length);
   	
   }
   
   public void setRl001MachToMachInfoRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001MachToMachInfoRedefined,rl001MachToMachInfoRedefined.length);
   	
   }
   
     /**
	 * 	Update Rl001MachToMachInfoRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001MachToMachInfoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001MachToMachInfoRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001MachToMachInfoRedefined with another Field
	 *	@param value
	 */
   public void setRl001MachToMachInfoRedefined(Field source) {
       replace(source,0,source.length(),beginRl001MachToMachInfoRedefined,RL_001_MACH_TO_MACH_INFO_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001MachToMachInfoRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001MachToMachInfoRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001MachToMachInfoRedefined,RL_001_MACH_TO_MACH_INFO_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Rl001MachToMachInfoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001MachToMachInfoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001MachToMachInfoRedefined+targetIndex,targetLen);
    
   }
	char[] rl001MachTdp88Value = "MB".toCharArray();
	/**
	 *	Test condition "MB" for isRl001MachTdp()
	 *	@return  Returns true if isRl001MachTdp() is "MB"
	 */
   public boolean isRl001MachTdp() throws CFException {
      return (  compareChars( getRl001MachToMachInfoRedefined() , rl001MachTdp88Value)  == 0  );
   }


	/**
	*  set values "MB"
	*/
   	public void setRl001MachTdpTrue() {  			
    	setRl001MachToMachInfoRedefined( rl001MachTdp88Value);
   	}
	char[] rl001MachOpp88Value = "MS".toCharArray();
	/**
	 *	Test condition "MS" for isRl001MachOpp()
	 *	@return  Returns true if isRl001MachOpp() is "MS"
	 */
   public boolean isRl001MachOpp() throws CFException {
      return (  compareChars( getRl001MachToMachInfoRedefined() , rl001MachOpp88Value)  == 0  );
   }


	/**
	*  set values "MS"
	*/
   	public void setRl001MachOppTrue() {  			
    	setRl001MachToMachInfoRedefined( rl001MachOpp88Value);
   	}
	/**
	 *	Returns the value of rl001PricingLabInd
	 *	@return rl001PricingLabInd
	 */
   public char[] getRl001PricingLabInd() throws CFException{
     if (isRl001PricingLabIndModified()) { 
        rl001PricingLabInd = refreshRl001PricingLabInd();
     }
   		return rl001PricingLabInd;
   }

  
	/**
	*  set variable rl001PricingLabInd
	*  Corresponding COBOL Variable is RL001-PRICING-LAB-IND
	*  @param value
	**/
   public void setRl001PricingLabInd(char[] value) {
      rl001PricingLabInd = checkRl001PricingLabIndConstraints(value);
      serializeRl001PricingLabInd(rl001PricingLabInd);
   } 

     /**
	 * 	Update Rl001PricingLabInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001PricingLabInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001PricingLabInd,rl001PricingLabInd.length);
   	
   }
   
   public void setRl001PricingLabInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingLabInd,rl001PricingLabInd.length);
   	
   }
   
     /**
	 * 	Update Rl001PricingLabInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001PricingLabInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingLabInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001PricingLabInd with another Field
	 *	@param value
	 */
   public void setRl001PricingLabInd(Field source) {
       replace(source,0,source.length(),beginRl001PricingLabInd,RL_001_PRICING_LAB_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001PricingLabInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001PricingLabInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001PricingLabInd,RL_001_PRICING_LAB_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rl001PricingLabInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001PricingLabInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001PricingLabInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rl001FirstBillInd
	 *	@return rl001FirstBillInd
	 */
   public char[] getRl001FirstBillInd() throws CFException{
     if (isRl001FirstBillIndModified()) { 
        rl001FirstBillInd = refreshRl001FirstBillInd();
     }
   		return rl001FirstBillInd;
   }

  
	/**
	*  set variable rl001FirstBillInd
	*  Corresponding COBOL Variable is RL001-FIRST-BILL-IND
	*  @param value
	**/
   public void setRl001FirstBillInd(char[] value) {
      rl001FirstBillInd = checkRl001FirstBillIndConstraints(value);
      serializeRl001FirstBillInd(rl001FirstBillInd);
   } 

     /**
	 * 	Update Rl001FirstBillInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001FirstBillInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001FirstBillInd,rl001FirstBillInd.length);
   	
   }
   
   public void setRl001FirstBillInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001FirstBillInd,rl001FirstBillInd.length);
   	
   }
   
     /**
	 * 	Update Rl001FirstBillInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001FirstBillInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001FirstBillInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001FirstBillInd with another Field
	 *	@param value
	 */
   public void setRl001FirstBillInd(Field source) {
       replace(source,0,source.length(),beginRl001FirstBillInd,RL_001_FIRST_BILL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001FirstBillInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001FirstBillInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001FirstBillInd,RL_001_FIRST_BILL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rl001FirstBillInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001FirstBillInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001FirstBillInd+targetIndex,targetLen);
    
   }
	char[] rl001FirstBill88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRl001FirstBill()
	 *	@return  Returns true if isRl001FirstBill() is "Y"
	 */
   public boolean isRl001FirstBill() throws CFException {
      return (  compareChars( getRl001FirstBillInd() , rl001FirstBill88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRl001FirstBillTrue() {  			
    	setRl001FirstBillInd( rl001FirstBill88Value);
   	}
	char[] rl001NotFirstBill88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRl001NotFirstBill()
	 *	@return  Returns true if isRl001NotFirstBill() is "N"
	 */
   public boolean isRl001NotFirstBill() throws CFException {
      return (  compareChars( getRl001FirstBillInd() , rl001NotFirstBill88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRl001NotFirstBillTrue() {  			
    	setRl001FirstBillInd( rl001NotFirstBill88Value);
   	}

	
	
	

		public static int getRl001CustomerDetailRecFieldLength() {
			return RL_001_CUSTOMER_DETAIL_REC_LENGTH;
		}

}
  
