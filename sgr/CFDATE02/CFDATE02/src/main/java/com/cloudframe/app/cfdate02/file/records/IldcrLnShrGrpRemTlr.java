package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldcrLnShrGrpRemTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldcrLnShrGrpRemTlr extends IldcrLnShrGrpRemTlrSerialized { 
   

						private char[] ildcrFiller = Field.fillLowValue(134);
	
	/**
	* Constructor for IldcrLnShrGrpRemTlr
	**/
    public IldcrLnShrGrpRemTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldcrLnShrGrpRemTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildcrFiller
	 *	@return ildcrFiller
	 */
   public char[] getIldcrFiller() throws CFException{
     if (isIldcrFillerModified()) { 
        ildcrFiller = refreshIldcrFiller();
     }
   		return ildcrFiller;
   }

  
	/**
	*  set variable ildcrFiller
	*  Corresponding COBOL Variable is ILDCR-FILLER
	*  @param value
	**/
   public void setIldcrFiller(char[] value) {
      ildcrFiller = checkIldcrFillerConstraints(value);
      serializeIldcrFiller(ildcrFiller);
   } 

     /**
	 * 	Update IldcrFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldcrFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldcrFiller,ildcrFiller.length);
   	
   }
   
   public void setIldcrFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFiller,ildcrFiller.length);
   	
   }
   
     /**
	 * 	Update IldcrFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldcrFiller with another Field
	 *	@param value
	 */
   public void setIldcrFiller(Field source) {
       replace(source,0,source.length(),beginIldcrFiller,ILDCR_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update IldcrFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldcrFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldcrFiller,ILDCR_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update IldcrFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldcrLnShrGrpRemTlrFieldLength() {
			return ILDCR_LN_SHR_GRP_REM_TLR_LENGTH;
		}

}
  
