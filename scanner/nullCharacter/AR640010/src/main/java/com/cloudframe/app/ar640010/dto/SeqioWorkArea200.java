package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioWorkArea200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SeqioWorkArea200 extends SeqioWorkArea200Serialized {
   
				private SeqioVarRecord200 seqioVarRecord200 = new SeqioVarRecord200();
	
	/**
	* Constructor for SeqioWorkArea200
	**/
    public SeqioWorkArea200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			seqioVarRecord200.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of seqioVarRecord200
	 *	@return seqioVarRecord200
	 */   
	 public SeqioVarRecord200 getSeqioVarRecord200() {
   	return seqioVarRecord200;
   }
   /**
	* 	Update SeqioVarRecord200 with the passed value
	*   Corresponding COBOL Variable is 200-SEQIO-VAR-RECORD
	*	@param value
	*/
   public void setSeqioVarRecord200(char[] value) {
      seqioVarRecord200.setString(value); 
   }   
    
     /**
	 * 	Update SeqioVarRecord200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSeqioVarRecord200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioVarRecord200.begin,seqioVarRecord200.length());
   }
   
     /**
	 * 	Update SeqioVarRecord200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioVarRecord200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioVarRecord200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SeqioVarRecord200 with another Field
	 *	@param value
	 */
   public void setSeqioVarRecord200(Field source) {
   	replace(source,0,source.length(),seqioVarRecord200.begin,seqioVarRecord200.length());
   }  
   
     /**
	 * 	Update SeqioVarRecord200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSeqioVarRecord200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioVarRecord200.begin,seqioVarRecord200.length());
   }
   
     /**
	 * 	Update SeqioVarRecord200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioVarRecord200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioVarRecord200.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSeqioWorkArea200FieldLength() {
			return SEQIO_WORK_AREA_200_LENGTH;
		}

}
  
