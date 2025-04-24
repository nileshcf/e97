package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldcrLnShrGrpRemTlr extends OldcrLnShrGrpRemTlrSerialized { 
   

						private char[] oldcrFiller = Field.fillLowValue(134);
	
	/**
	* Constructor for OldcrLnShrGrpRemTlr
	**/
    public OldcrLnShrGrpRemTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldcrLnShrGrpRemTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldcrFiller
	 *	@return oldcrFiller
	 */
   public char[] getOldcrFiller() throws CFException{
     if (isOldcrFillerModified()) { 
        oldcrFiller = refreshOldcrFiller();
     }
   		return oldcrFiller;
   }

  
	/**
	*  set variable oldcrFiller
	*  Corresponding COBOL Variable is OLDCR-FILLER
	*  @param value
	**/
   public void setOldcrFiller(char[] value) {
      oldcrFiller = checkOldcrFillerConstraints(value);
      serializeOldcrFiller(oldcrFiller);
   } 

     /**
	 * 	Update OldcrFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldcrFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldcrFiller,oldcrFiller.length);
   	
   }
   
   public void setOldcrFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFiller,oldcrFiller.length);
   	
   }
   
     /**
	 * 	Update OldcrFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldcrFiller with another Field
	 *	@param value
	 */
   public void setOldcrFiller(Field source) {
       replace(source,0,source.length(),beginOldcrFiller,OLDCR_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update OldcrFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldcrFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldcrFiller,OLDCR_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update OldcrFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldcrLnShrGrpRemTlrFieldLength() {
			return OLDCR_LN_SHR_GRP_REM_TLR_LENGTH;
		}

}
  
