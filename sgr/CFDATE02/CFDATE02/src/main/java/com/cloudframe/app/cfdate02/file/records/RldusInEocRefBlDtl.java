package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocRefBlDtl extends RldusInEocRefBlDtlSerialized { 
   

						private char[] rldusCpduRec = Field.fillLowValue(161);
	
	/**
	* Constructor for RldusInEocRefBlDtl
	**/
    public RldusInEocRefBlDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RldusInEocRefBlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rldusCpduRec
	 *	@return rldusCpduRec
	 */
   public char[] getRldusCpduRec() throws CFException{
     if (isRldusCpduRecModified()) { 
        rldusCpduRec = refreshRldusCpduRec();
     }
   		return rldusCpduRec;
   }

  
	/**
	*  set variable rldusCpduRec
	*  Corresponding COBOL Variable is RLDUS-CPDU-REC
	*  @param value
	**/
   public void setRldusCpduRec(char[] value) {
      rldusCpduRec = checkRldusCpduRecConstraints(value);
      serializeRldusCpduRec(rldusCpduRec);
   } 

     /**
	 * 	Update RldusCpduRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRldusCpduRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRldusCpduRec,rldusCpduRec.length);
   	
   }
   
   public void setRldusCpduRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCpduRec,rldusCpduRec.length);
   	
   }
   
     /**
	 * 	Update RldusCpduRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusCpduRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCpduRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RldusCpduRec with another Field
	 *	@param value
	 */
   public void setRldusCpduRec(Field source) {
       replace(source,0,source.length(),beginRldusCpduRec,RLDUS_CPDU_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RldusCpduRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRldusCpduRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRldusCpduRec,RLDUS_CPDU_REC_LEN);
   	
   }
   
     /**
	 * 	Update RldusCpduRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusCpduRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusCpduRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRldusInEocRefBlDtlFieldLength() {
			return RLDUS_IN_EOC_REF_BL_DTL_LENGTH;
		}

}
  
