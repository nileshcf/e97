package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fVzedgePaymtSched is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlu5fVzedgePaymtSched extends Rlu5fVzedgePaymtSchedSerialized { 
   

						private char[] rlu5fVzedgePymtDueDt = Field.fillLowValue(8);
	
	/**
	* Constructor for Rlu5fVzedgePaymtSched
	**/
    public Rlu5fVzedgePaymtSched() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fVzedgePaymtSched. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fVzedgePaymtSched(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fVzedgePymtDueDt
	 *	@return rlu5fVzedgePymtDueDt
	 */
   public char[] getRlu5fVzedgePymtDueDt() throws CFException{
     if (isRlu5fVzedgePymtDueDtModified()) { 
        rlu5fVzedgePymtDueDt = refreshRlu5fVzedgePymtDueDt();
     }
   		return rlu5fVzedgePymtDueDt;
   }

  
	/**
	*  set variable rlu5fVzedgePymtDueDt
	*  Corresponding COBOL Variable is RLU5F-VZEDGE-PYMT-DUE-DT
	*  @param value
	**/
   public void setRlu5fVzedgePymtDueDt(char[] value) {
      rlu5fVzedgePymtDueDt = checkRlu5fVzedgePymtDueDtConstraints(value);
      serializeRlu5fVzedgePymtDueDt(rlu5fVzedgePymtDueDt);
   } 

     /**
	 * 	Update Rlu5fVzedgePymtDueDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fVzedgePymtDueDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fVzedgePymtDueDt,rlu5fVzedgePymtDueDt.length);
   	
   }
   
   public void setRlu5fVzedgePymtDueDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePymtDueDt,rlu5fVzedgePymtDueDt.length);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgePymtDueDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgePymtDueDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePymtDueDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fVzedgePymtDueDt with another Field
	 *	@param value
	 */
   public void setRlu5fVzedgePymtDueDt(Field source) {
       replace(source,0,source.length(),beginRlu5fVzedgePymtDueDt,RLU_5F_VZEDGE_PYMT_DUE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fVzedgePymtDueDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fVzedgePymtDueDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePymtDueDt,RLU_5F_VZEDGE_PYMT_DUE_DT_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fVzedgePymtDueDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fVzedgePymtDueDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fVzedgePymtDueDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlu5fVzedgePaymtSched
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fVzedgePymtDueDt(CONSTANTS.SPACE_8);
   }

		public static int getRlu5fVzedgePaymtSchedFieldLength() {
			return RLU_5F_VZEDGE_PAYMT_SCHED_LENGTH;
		}

}
  
