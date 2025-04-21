package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldclLnShrBcActvTlr extends IldclLnShrBcActvTlrSerialized { 
   

						private char[] ildclFiller = Field.fillLowValue(311);
	
	/**
	* Constructor for IldclLnShrBcActvTlr
	**/
    public IldclLnShrBcActvTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldclLnShrBcActvTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildclFiller
	 *	@return ildclFiller
	 */
   public char[] getIldclFiller() throws CFException{
     if (isIldclFillerModified()) { 
        ildclFiller = refreshIldclFiller();
     }
   		return ildclFiller;
   }

  
	/**
	*  set variable ildclFiller
	*  Corresponding COBOL Variable is ILDCL-FILLER
	*  @param value
	**/
   public void setIldclFiller(char[] value) {
      ildclFiller = checkIldclFillerConstraints(value);
      serializeIldclFiller(ildclFiller);
   } 

     /**
	 * 	Update IldclFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldclFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldclFiller,ildclFiller.length);
   	
   }
   
   public void setIldclFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFiller,ildclFiller.length);
   	
   }
   
     /**
	 * 	Update IldclFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldclFiller with another Field
	 *	@param value
	 */
   public void setIldclFiller(Field source) {
       replace(source,0,source.length(),beginIldclFiller,ILDCL_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update IldclFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldclFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldclFiller,ILDCL_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update IldclFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldclLnShrBcActvTlrFieldLength() {
			return ILDCL_LN_SHR_BC_ACTV_TLR_LENGTH;
		}

}
  
