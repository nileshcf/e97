package com.cloudframe.app.init1.dto;

/**
*  The class Rl001DtlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001DtlRecord extends Rl001DtlRecordSerialized { 
   
				private Rl001CustomerDetailRec rl001CustomerDetailRec = new Rl001CustomerDetailRec();
	
	/**
	* Constructor for Rl001DtlRecord
	**/
    public Rl001DtlRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl001DtlRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001DtlRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			rl001CustomerDetailRec.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of rl001CustomerDetailRec
	 *	@return rl001CustomerDetailRec
	 */   
	 public Rl001CustomerDetailRec getRl001CustomerDetailRec() {
   	return rl001CustomerDetailRec;
   }
   /**
	* 	Update Rl001CustomerDetailRec with the passed value
	*   Corresponding COBOL Variable is RL001-CUSTOMER-DETAIL-REC
	*	@param value
	*/
   public void setRl001CustomerDetailRec(char[] value) {
      rl001CustomerDetailRec.setString(value); 
   }   
    
     /**
	 * 	Update Rl001CustomerDetailRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl001CustomerDetailRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001CustomerDetailRec.begin,rl001CustomerDetailRec.length());
   }
   
     /**
	 * 	Update Rl001CustomerDetailRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerDetailRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001CustomerDetailRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rl001CustomerDetailRec with another Field
	 *	@param value
	 */
   public void setRl001CustomerDetailRec(Field source) {
   	replace(source,0,source.length(),rl001CustomerDetailRec.begin,rl001CustomerDetailRec.length());
   }  
   
     /**
	 * 	Update Rl001CustomerDetailRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl001CustomerDetailRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rl001CustomerDetailRec.begin,rl001CustomerDetailRec.length());
   }
   
     /**
	 * 	Update Rl001CustomerDetailRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerDetailRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rl001CustomerDetailRec.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRl001DtlRecordFieldLength() {
			return RL_001_DTL_RECORD_LENGTH;
		}

}
  
