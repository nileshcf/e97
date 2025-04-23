package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioVarRecord200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SeqioVarRecord200 extends SeqioVarRecord200Serialized { 
   
				private SeqioRdw200 seqioRdw200 = new SeqioRdw200();
				private SeqioDataGroup200 seqioDataGroup200 = new SeqioDataGroup200();
	
	/**
	* Constructor for SeqioVarRecord200
	**/
    public SeqioVarRecord200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SeqioVarRecord200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioVarRecord200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			seqioRdw200.setParent(this,getStartOffset() + 0);
	       			seqioDataGroup200.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of seqioRdw200
	 *	@return seqioRdw200
	 */   
	 public SeqioRdw200 getSeqioRdw200() {
   	return seqioRdw200;
   }
   /**
	* 	Update SeqioRdw200 with the passed value
	*   Corresponding COBOL Variable is 200-SEQIO-RDW
	*	@param value
	*/
   public void setSeqioRdw200(char[] value) {
      seqioRdw200.setString(value); 
   }   
    
     /**
	 * 	Update SeqioRdw200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSeqioRdw200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioRdw200.begin,seqioRdw200.length());
   }
   
     /**
	 * 	Update SeqioRdw200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioRdw200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioRdw200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SeqioRdw200 with another Field
	 *	@param value
	 */
   public void setSeqioRdw200(Field source) {
   	replace(source,0,source.length(),seqioRdw200.begin,seqioRdw200.length());
   }  
   
     /**
	 * 	Update SeqioRdw200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSeqioRdw200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioRdw200.begin,seqioRdw200.length());
   }
   
     /**
	 * 	Update SeqioRdw200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioRdw200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioRdw200.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of seqioDataGroup200
	 *	@return seqioDataGroup200
	 */   
	 public SeqioDataGroup200 getSeqioDataGroup200() {
   	return seqioDataGroup200;
   }
   /**
	* 	Update SeqioDataGroup200 with the passed value
	*   Corresponding COBOL Variable is 200-SEQIO-DATA-GROUP
	*	@param value
	*/
   public void setSeqioDataGroup200(char[] value) {
      seqioDataGroup200.setString(value); 
   }   
    
     /**
	 * 	Update SeqioDataGroup200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSeqioDataGroup200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioDataGroup200.begin,seqioDataGroup200.length());
   }
   
     /**
	 * 	Update SeqioDataGroup200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioDataGroup200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioDataGroup200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SeqioDataGroup200 with another Field
	 *	@param value
	 */
   public void setSeqioDataGroup200(Field source) {
   	replace(source,0,source.length(),seqioDataGroup200.begin,seqioDataGroup200.length());
   }  
   
     /**
	 * 	Update SeqioDataGroup200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSeqioDataGroup200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,seqioDataGroup200.begin,seqioDataGroup200.length());
   }
   
     /**
	 * 	Update SeqioDataGroup200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioDataGroup200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,seqioDataGroup200.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSeqioVarRecord200FieldLength() {
			return SEQIO_VAR_RECORD_200_LENGTH;
		}

}
  
