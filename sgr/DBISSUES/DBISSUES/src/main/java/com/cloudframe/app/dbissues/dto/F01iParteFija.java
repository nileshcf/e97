package com.cloudframe.app.dbissues.dto;

/**
*  The class F01iParteFija is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:14. using version 5.0.0.256
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01iParteFija extends F01iParteFijaSerialized { 
   
				private F01iIzdatparr f01iIzdatparr = new F01iIzdatparr();
				private F01iIzdattab f01iIzdattab = new F01iIzdattab();

								private long f01iIznuchar;
	
	/**
	* Constructor for F01iParteFija
	**/
    public F01iParteFija() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01iParteFija. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iParteFija(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			f01iIzdatparr.setParent(this,getStartOffset() + 85);
	       			f01iIzdattab.setParent(this,getStartOffset() + 85);
    } 

	/**
	 *	Returns the value of f01iIzdatparr
	 *	@return f01iIzdatparr
	 */   
	 public F01iIzdatparr getF01iIzdatparr() {
   	return f01iIzdatparr;
   }
   /**
	* 	Update F01iIzdatparr with the passed value
	*   Corresponding COBOL Variable is F01I-IZDATPARR
	*	@param value
	*/
   public void setF01iIzdatparr(char[] value) {
      f01iIzdatparr.setString(value); 
   }   
    
     /**
	 * 	Update F01iIzdatparr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01iIzdatparr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdatparr.begin,f01iIzdatparr.length());
   }
   
     /**
	 * 	Update F01iIzdatparr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01iIzdatparr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdatparr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01iIzdatparr with another Field
	 *	@param value
	 */
   public void setF01iIzdatparr(Field source) {
   	replace(source,0,source.length(),f01iIzdatparr.begin,f01iIzdatparr.length());
   }  
   
     /**
	 * 	Update F01iIzdatparr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01iIzdatparr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdatparr.begin,f01iIzdatparr.length());
   }
   
     /**
	 * 	Update F01iIzdatparr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01iIzdatparr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdatparr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of f01iIzdattab
	 *	@return f01iIzdattab
	 */   
	 public F01iIzdattab getF01iIzdattab() {
   	return f01iIzdattab;
   }
   /**
	* 	Update F01iIzdattab with the passed value
	*   Corresponding COBOL Variable is F01I-IZDATTAB
	*	@param value
	*/
   public void setF01iIzdattab(char[] value) {
      f01iIzdattab.setString(value); 
   }   
    
     /**
	 * 	Update F01iIzdattab 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01iIzdattab(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdattab.begin,f01iIzdattab.length());
   }
   
     /**
	 * 	Update F01iIzdattab 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01iIzdattab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdattab.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01iIzdattab with another Field
	 *	@param value
	 */
   public void setF01iIzdattab(Field source) {
   	replace(source,0,source.length(),f01iIzdattab.begin,f01iIzdattab.length());
   }  
   
     /**
	 * 	Update F01iIzdattab 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01iIzdattab(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdattab.begin,f01iIzdattab.length());
   }
   
     /**
	 * 	Update F01iIzdattab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01iIzdattab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01iIzdattab.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of f01iIznuchar
	 *	@return f01iIznuchar
	 */
	public long getF01iIznuchar() throws CFException {
       if (isF01iIznucharModified()) { 
           f01iIznuchar = refreshF01iIznuchar();
        }
   		return f01iIznuchar;
	}
	

	
	   
	/**
	 * 	Update F01iIznuchar with the passed value
	 *  Corresponding COBOL Variable is F01I-IZNUCHAR
	 *	@param number
	 */
	public void setF01iIznuchar(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    f01iIznuchar = checkF01iIznucharMaxLimit(number); 
		serializeF01iIznuchar(f01iIznuchar);
	}
	

	/**
	 * 	Update F01iIznuchar with the passed value
	 *	@param value (String or char[])
	 */
	public void setF01iIznuchar(char[] value) throws CFException {
		 f01iIznuchar = serializeF01iIznuchar(value);
	}
	/**
	 * 	Update F01iIznuchar with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setF01iIznucharString(char[] value) throws CFException {
		 setF01iIznuchar(value);
	}

	
	
	

		public static int getF01iParteFijaFieldLength() {
			return F_01I_PARTE_FIJA_LENGTH;
		}

}
  
