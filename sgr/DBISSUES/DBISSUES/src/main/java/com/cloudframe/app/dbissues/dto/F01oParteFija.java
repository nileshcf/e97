package com.cloudframe.app.dbissues.dto;

/**
*  The class F01oParteFija is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01oParteFija extends F01oParteFijaSerialized { 
   
				private F01oIzdatparr f01oIzdatparr = new F01oIzdatparr();
				private F01oIzdattab f01oIzdattab = new F01oIzdattab();

								private long f01oIznuchar;
	
	/**
	* Constructor for F01oParteFija
	**/
    public F01oParteFija() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01oParteFija. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oParteFija(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			f01oIzdatparr.setParent(this,getStartOffset() + 85);
	       			f01oIzdattab.setParent(this,getStartOffset() + 85);
    } 

	/**
	 *	Returns the value of f01oIzdatparr
	 *	@return f01oIzdatparr
	 */   
	 public F01oIzdatparr getF01oIzdatparr() {
   	return f01oIzdatparr;
   }
   /**
	* 	Update F01oIzdatparr with the passed value
	*   Corresponding COBOL Variable is F01O-IZDATPARR
	*	@param value
	*/
   public void setF01oIzdatparr(char[] value) {
      f01oIzdatparr.setString(value); 
   }   
    
     /**
	 * 	Update F01oIzdatparr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01oIzdatparr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdatparr.begin,f01oIzdatparr.length());
   }
   
     /**
	 * 	Update F01oIzdatparr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01oIzdatparr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdatparr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01oIzdatparr with another Field
	 *	@param value
	 */
   public void setF01oIzdatparr(Field source) {
   	replace(source,0,source.length(),f01oIzdatparr.begin,f01oIzdatparr.length());
   }  
   
     /**
	 * 	Update F01oIzdatparr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01oIzdatparr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdatparr.begin,f01oIzdatparr.length());
   }
   
     /**
	 * 	Update F01oIzdatparr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01oIzdatparr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdatparr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of f01oIzdattab
	 *	@return f01oIzdattab
	 */   
	 public F01oIzdattab getF01oIzdattab() {
   	return f01oIzdattab;
   }
   /**
	* 	Update F01oIzdattab with the passed value
	*   Corresponding COBOL Variable is F01O-IZDATTAB
	*	@param value
	*/
   public void setF01oIzdattab(char[] value) {
      f01oIzdattab.setString(value); 
   }   
    
     /**
	 * 	Update F01oIzdattab 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setF01oIzdattab(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdattab.begin,f01oIzdattab.length());
   }
   
     /**
	 * 	Update F01oIzdattab 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setF01oIzdattab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdattab.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update F01oIzdattab with another Field
	 *	@param value
	 */
   public void setF01oIzdattab(Field source) {
   	replace(source,0,source.length(),f01oIzdattab.begin,f01oIzdattab.length());
   }  
   
     /**
	 * 	Update F01oIzdattab 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setF01oIzdattab(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdattab.begin,f01oIzdattab.length());
   }
   
     /**
	 * 	Update F01oIzdattab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setF01oIzdattab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,f01oIzdattab.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of f01oIznuchar
	 *	@return f01oIznuchar
	 */
	public long getF01oIznuchar() throws CFException {
       if (isF01oIznucharModified()) { 
           f01oIznuchar = refreshF01oIznuchar();
        }
   		return f01oIznuchar;
	}
	

	
	   
	/**
	 * 	Update F01oIznuchar with the passed value
	 *  Corresponding COBOL Variable is F01O-IZNUCHAR
	 *	@param number
	 */
	public void setF01oIznuchar(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    f01oIznuchar = checkF01oIznucharMaxLimit(number); 
		serializeF01oIznuchar(f01oIznuchar);
	}
	

	/**
	 * 	Update F01oIznuchar with the passed value
	 *	@param value (String or char[])
	 */
	public void setF01oIznuchar(char[] value) throws CFException {
		 f01oIznuchar = serializeF01oIznuchar(value);
	}
	/**
	 * 	Update F01oIznuchar with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setF01oIznucharString(char[] value) throws CFException {
		 setF01oIznuchar(value);
	}

	
	
	

		public static int getF01oParteFijaFieldLength() {
			return F_01O_PARTE_FIJA_LENGTH;
		}

}
  
