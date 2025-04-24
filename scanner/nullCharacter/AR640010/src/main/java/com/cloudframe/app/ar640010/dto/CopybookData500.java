package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CopybookData500 extends CopybookData500Serialized { 
   

						private char[] copybook010500 = new char[12];

						private char[] copybook020500 = new char[12];

						private char[] copybook030500 = new char[12];

						private char[] copybook040500 = new char[12];

						private char[] copybook050500 = new char[12];

						private char[] copybook060500 = new char[12];

						private char[] copybook070500 = new char[12];

						private char[] copybook080500 = new char[12];

						private char[] copybook090500 = new char[12];

	
	/**
	* Constructor for CopybookData500
	**/
    public CopybookData500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CopybookData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCopybook010500(("2000-10-14#0").toCharArray());
								setCopybook020500(("2001-01-15#0").toCharArray());
								setCopybook030500(("2001-07-05#0").toCharArray());
								setCopybook040500(("2002-05-23#0").toCharArray());
								setCopybook050500(("2003-05-27#0").toCharArray());
								setCopybook060500(("2010-04-05#0").toCharArray());
								setCopybook070500(("2010-05-25#0").toCharArray());
								setCopybook080500(("2012-09-25#0").toCharArray());
								setCopybook090500(("2013-04-15#0").toCharArray());
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(12, "fillHighValue(12)")).toCharArray()
             , getStartOffset() + 108
             ,12
             );
    } 

	/**
	 *	Returns the value of copybook010500
	 *	@return copybook010500
	 */
   public char[] getCopybook010500() throws CFException{
     if (isCopybook010500Modified()) { 
        copybook010500 = refreshCopybook010500();
     }
   		return copybook010500;
   }

  
	/**
	*  set variable copybook010500
	*  Corresponding COBOL Variable is 500-COPYBOOK-01-0
	*  @param value
	**/
   public void setCopybook010500(char[] value) {
      copybook010500 = checkCopybook010500Constraints(value);
      serializeCopybook010500(copybook010500);
   } 

     /**
	 * 	Update Copybook010500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook010500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook010500,copybook010500.length);
   	
   }
   
   public void setCopybook010500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook010500,copybook010500.length);
   	
   }
   
     /**
	 * 	Update Copybook010500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook010500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook010500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook010500 with another Field
	 *	@param value
	 */
   public void setCopybook010500(Field source) {
       replace(source,0,source.length(),beginCopybook010500,COPYBOOK_010500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook010500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook010500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook010500,COPYBOOK_010500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook010500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook010500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook010500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook020500
	 *	@return copybook020500
	 */
   public char[] getCopybook020500() throws CFException{
     if (isCopybook020500Modified()) { 
        copybook020500 = refreshCopybook020500();
     }
   		return copybook020500;
   }

  
	/**
	*  set variable copybook020500
	*  Corresponding COBOL Variable is 500-COPYBOOK-02-0
	*  @param value
	**/
   public void setCopybook020500(char[] value) {
      copybook020500 = checkCopybook020500Constraints(value);
      serializeCopybook020500(copybook020500);
   } 

     /**
	 * 	Update Copybook020500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook020500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook020500,copybook020500.length);
   	
   }
   
   public void setCopybook020500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook020500,copybook020500.length);
   	
   }
   
     /**
	 * 	Update Copybook020500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook020500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook020500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook020500 with another Field
	 *	@param value
	 */
   public void setCopybook020500(Field source) {
       replace(source,0,source.length(),beginCopybook020500,COPYBOOK_020500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook020500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook020500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook020500,COPYBOOK_020500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook020500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook020500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook020500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook030500
	 *	@return copybook030500
	 */
   public char[] getCopybook030500() throws CFException{
     if (isCopybook030500Modified()) { 
        copybook030500 = refreshCopybook030500();
     }
   		return copybook030500;
   }

  
	/**
	*  set variable copybook030500
	*  Corresponding COBOL Variable is 500-COPYBOOK-03-0
	*  @param value
	**/
   public void setCopybook030500(char[] value) {
      copybook030500 = checkCopybook030500Constraints(value);
      serializeCopybook030500(copybook030500);
   } 

     /**
	 * 	Update Copybook030500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook030500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook030500,copybook030500.length);
   	
   }
   
   public void setCopybook030500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook030500,copybook030500.length);
   	
   }
   
     /**
	 * 	Update Copybook030500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook030500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook030500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook030500 with another Field
	 *	@param value
	 */
   public void setCopybook030500(Field source) {
       replace(source,0,source.length(),beginCopybook030500,COPYBOOK_030500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook030500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook030500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook030500,COPYBOOK_030500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook030500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook030500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook030500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook040500
	 *	@return copybook040500
	 */
   public char[] getCopybook040500() throws CFException{
     if (isCopybook040500Modified()) { 
        copybook040500 = refreshCopybook040500();
     }
   		return copybook040500;
   }

  
	/**
	*  set variable copybook040500
	*  Corresponding COBOL Variable is 500-COPYBOOK-04-0
	*  @param value
	**/
   public void setCopybook040500(char[] value) {
      copybook040500 = checkCopybook040500Constraints(value);
      serializeCopybook040500(copybook040500);
   } 

     /**
	 * 	Update Copybook040500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook040500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook040500,copybook040500.length);
   	
   }
   
   public void setCopybook040500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook040500,copybook040500.length);
   	
   }
   
     /**
	 * 	Update Copybook040500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook040500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook040500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook040500 with another Field
	 *	@param value
	 */
   public void setCopybook040500(Field source) {
       replace(source,0,source.length(),beginCopybook040500,COPYBOOK_040500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook040500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook040500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook040500,COPYBOOK_040500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook040500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook040500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook040500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook050500
	 *	@return copybook050500
	 */
   public char[] getCopybook050500() throws CFException{
     if (isCopybook050500Modified()) { 
        copybook050500 = refreshCopybook050500();
     }
   		return copybook050500;
   }

  
	/**
	*  set variable copybook050500
	*  Corresponding COBOL Variable is 500-COPYBOOK-05-0
	*  @param value
	**/
   public void setCopybook050500(char[] value) {
      copybook050500 = checkCopybook050500Constraints(value);
      serializeCopybook050500(copybook050500);
   } 

     /**
	 * 	Update Copybook050500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook050500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook050500,copybook050500.length);
   	
   }
   
   public void setCopybook050500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook050500,copybook050500.length);
   	
   }
   
     /**
	 * 	Update Copybook050500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook050500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook050500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook050500 with another Field
	 *	@param value
	 */
   public void setCopybook050500(Field source) {
       replace(source,0,source.length(),beginCopybook050500,COPYBOOK_050500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook050500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook050500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook050500,COPYBOOK_050500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook050500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook050500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook050500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook060500
	 *	@return copybook060500
	 */
   public char[] getCopybook060500() throws CFException{
     if (isCopybook060500Modified()) { 
        copybook060500 = refreshCopybook060500();
     }
   		return copybook060500;
   }

  
	/**
	*  set variable copybook060500
	*  Corresponding COBOL Variable is 500-COPYBOOK-06-0
	*  @param value
	**/
   public void setCopybook060500(char[] value) {
      copybook060500 = checkCopybook060500Constraints(value);
      serializeCopybook060500(copybook060500);
   } 

     /**
	 * 	Update Copybook060500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook060500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook060500,copybook060500.length);
   	
   }
   
   public void setCopybook060500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook060500,copybook060500.length);
   	
   }
   
     /**
	 * 	Update Copybook060500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook060500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook060500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook060500 with another Field
	 *	@param value
	 */
   public void setCopybook060500(Field source) {
       replace(source,0,source.length(),beginCopybook060500,COPYBOOK_060500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook060500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook060500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook060500,COPYBOOK_060500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook060500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook060500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook060500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook070500
	 *	@return copybook070500
	 */
   public char[] getCopybook070500() throws CFException{
     if (isCopybook070500Modified()) { 
        copybook070500 = refreshCopybook070500();
     }
   		return copybook070500;
   }

  
	/**
	*  set variable copybook070500
	*  Corresponding COBOL Variable is 500-COPYBOOK-07-0
	*  @param value
	**/
   public void setCopybook070500(char[] value) {
      copybook070500 = checkCopybook070500Constraints(value);
      serializeCopybook070500(copybook070500);
   } 

     /**
	 * 	Update Copybook070500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook070500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook070500,copybook070500.length);
   	
   }
   
   public void setCopybook070500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook070500,copybook070500.length);
   	
   }
   
     /**
	 * 	Update Copybook070500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook070500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook070500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook070500 with another Field
	 *	@param value
	 */
   public void setCopybook070500(Field source) {
       replace(source,0,source.length(),beginCopybook070500,COPYBOOK_070500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook070500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook070500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook070500,COPYBOOK_070500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook070500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook070500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook070500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook080500
	 *	@return copybook080500
	 */
   public char[] getCopybook080500() throws CFException{
     if (isCopybook080500Modified()) { 
        copybook080500 = refreshCopybook080500();
     }
   		return copybook080500;
   }

  
	/**
	*  set variable copybook080500
	*  Corresponding COBOL Variable is 500-COPYBOOK-08-0
	*  @param value
	**/
   public void setCopybook080500(char[] value) {
      copybook080500 = checkCopybook080500Constraints(value);
      serializeCopybook080500(copybook080500);
   } 

     /**
	 * 	Update Copybook080500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook080500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook080500,copybook080500.length);
   	
   }
   
   public void setCopybook080500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook080500,copybook080500.length);
   	
   }
   
     /**
	 * 	Update Copybook080500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook080500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook080500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook080500 with another Field
	 *	@param value
	 */
   public void setCopybook080500(Field source) {
       replace(source,0,source.length(),beginCopybook080500,COPYBOOK_080500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook080500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook080500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook080500,COPYBOOK_080500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook080500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook080500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook080500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copybook090500
	 *	@return copybook090500
	 */
   public char[] getCopybook090500() throws CFException{
     if (isCopybook090500Modified()) { 
        copybook090500 = refreshCopybook090500();
     }
   		return copybook090500;
   }

  
	/**
	*  set variable copybook090500
	*  Corresponding COBOL Variable is 500-COPYBOOK-09-0
	*  @param value
	**/
   public void setCopybook090500(char[] value) {
      copybook090500 = checkCopybook090500Constraints(value);
      serializeCopybook090500(copybook090500);
   } 

     /**
	 * 	Update Copybook090500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopybook090500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopybook090500,copybook090500.length);
   	
   }
   
   public void setCopybook090500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook090500,copybook090500.length);
   	
   }
   
     /**
	 * 	Update Copybook090500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybook090500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook090500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Copybook090500 with another Field
	 *	@param value
	 */
   public void setCopybook090500(Field source) {
       replace(source,0,source.length(),beginCopybook090500,COPYBOOK_090500_LEN);
   	
   }  
   
     /**
	 * 	Update Copybook090500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopybook090500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopybook090500,COPYBOOK_090500_LEN);
   	
   }
   
     /**
	 * 	Update Copybook090500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybook090500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopybook090500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCopybookData500FieldLength() {
			return COPYBOOK_DATA_500_LENGTH;
		}

}
  
