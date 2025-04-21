package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldclLnShrBcActvTlr extends OldclLnShrBcActvTlrSerialized { 
   

						private char[] oldclFiller = Field.fillLowValue(311);
	
	/**
	* Constructor for OldclLnShrBcActvTlr
	**/
    public OldclLnShrBcActvTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldclLnShrBcActvTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldclFiller
	 *	@return oldclFiller
	 */
   public char[] getOldclFiller() throws CFException{
     if (isOldclFillerModified()) { 
        oldclFiller = refreshOldclFiller();
     }
   		return oldclFiller;
   }

  
	/**
	*  set variable oldclFiller
	*  Corresponding COBOL Variable is OLDCL-FILLER
	*  @param value
	**/
   public void setOldclFiller(char[] value) {
      oldclFiller = checkOldclFillerConstraints(value);
      serializeOldclFiller(oldclFiller);
   } 

     /**
	 * 	Update OldclFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldclFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldclFiller,oldclFiller.length);
   	
   }
   
   public void setOldclFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFiller,oldclFiller.length);
   	
   }
   
     /**
	 * 	Update OldclFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldclFiller with another Field
	 *	@param value
	 */
   public void setOldclFiller(Field source) {
       replace(source,0,source.length(),beginOldclFiller,OLDCL_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update OldclFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldclFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldclFiller,OLDCL_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update OldclFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldclLnShrBcActvTlrFieldLength() {
			return OLDCL_LN_SHR_BC_ACTV_TLR_LENGTH;
		}

}
  
