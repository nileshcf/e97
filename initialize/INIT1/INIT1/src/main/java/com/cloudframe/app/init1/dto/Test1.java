package com.cloudframe.app.init1.dto;

/**
*  The class Test1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Test1 extends Test1Serialized {
   
				private Billku00NextCycEndDt billku00NextCycEndDt = new Billku00NextCycEndDt();
	
	/**
	* Constructor for Test1
	**/
    public Test1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			billku00NextCycEndDt.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of billku00NextCycEndDt
	 *	@return billku00NextCycEndDt
	 */   
	 public Billku00NextCycEndDt getBillku00NextCycEndDt() {
   	return billku00NextCycEndDt;
   }
   /**
	* 	Update Billku00NextCycEndDt with the passed value
	*   Corresponding COBOL Variable is BILLKU00-NEXT-CYC-END-DT
	*	@param value
	*/
   public void setBillku00NextCycEndDt(char[] value) {
      billku00NextCycEndDt.setString(value); 
   }   
    
     /**
	 * 	Update Billku00NextCycEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBillku00NextCycEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,billku00NextCycEndDt.begin,billku00NextCycEndDt.length());
   }
   
     /**
	 * 	Update Billku00NextCycEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBillku00NextCycEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,billku00NextCycEndDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Billku00NextCycEndDt with another Field
	 *	@param value
	 */
   public void setBillku00NextCycEndDt(Field source) {
   	replace(source,0,source.length(),billku00NextCycEndDt.begin,billku00NextCycEndDt.length());
   }  
   
     /**
	 * 	Update Billku00NextCycEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBillku00NextCycEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,billku00NextCycEndDt.begin,billku00NextCycEndDt.length());
   }
   
     /**
	 * 	Update Billku00NextCycEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBillku00NextCycEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,billku00NextCycEndDt.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Test1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          billku00NextCycEndDt.initialize();
     
   }

		public static int getTest1FieldLength() {
			return TEST_1_LENGTH;
		}

}
  
