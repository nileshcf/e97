package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioDataGroup200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SeqioDataGroup200 extends SeqioDataGroup200Serialized { 
   

						private char[] seqioData200 = new char[32768];
	
	/**
	* Constructor for SeqioDataGroup200
	**/
    public SeqioDataGroup200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SeqioDataGroup200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioDataGroup200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSeqioData200(pad(32768," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of seqioData200
	 *	@return seqioData200
	 */
   public char[] getSeqioData200() throws CFException{
     if (isSeqioData200Modified()) { 
        seqioData200 = refreshSeqioData200();
     }
   		return seqioData200;
   }

  
	/**
	*  set variable seqioData200
	*  Corresponding COBOL Variable is 200-SEQIO-DATA
	*  @param value
	**/
   public void setSeqioData200(char[] value) {
      seqioData200 = checkSeqioData200Constraints(value);
      serializeSeqioData200(seqioData200);
   } 

     /**
	 * 	Update SeqioData200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeqioData200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeqioData200,seqioData200.length);
   	
   }
   
   public void setSeqioData200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioData200,seqioData200.length);
   	
   }
   
     /**
	 * 	Update SeqioData200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeqioData200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioData200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeqioData200 with another Field
	 *	@param value
	 */
   public void setSeqioData200(Field source) {
       replace(source,0,source.length(),beginSeqioData200,SEQIO_DATA_200_LEN);
   	
   }  
   
     /**
	 * 	Update SeqioData200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeqioData200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeqioData200,SEQIO_DATA_200_LEN);
   	
   }
   
     /**
	 * 	Update SeqioData200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeqioData200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeqioData200+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSeqioDataGroup200FieldLength() {
			return SEQIO_DATA_GROUP_200_LENGTH;
		}

}
  
