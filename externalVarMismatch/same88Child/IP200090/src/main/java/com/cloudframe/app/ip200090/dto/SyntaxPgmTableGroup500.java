package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmTableGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SyntaxPgmTableGroup500 extends SyntaxPgmTableGroup500Serialized {
   
					private SyntaxPgmTable500 syntaxPgmTable500 = new SyntaxPgmTable500();
					private SyntaxPgmRedTable500 syntaxPgmRedTable500 = new SyntaxPgmRedTable500();
	
	/**
	* Constructor for SyntaxPgmTableGroup500
	**/
    public SyntaxPgmTableGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			syntaxPgmTable500.setParent(this,getStartOffset() + 0);
	       			syntaxPgmRedTable500.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of syntaxPgmTable500
	 *	@return syntaxPgmTable500
	 */   
	 public SyntaxPgmTable500 getSyntaxPgmTable500() {
   	return syntaxPgmTable500;
   }
   /**
	* 	Update SyntaxPgmTable500 with the passed value
	*   Corresponding COBOL Variable is 500-SYNTAX-PGM-TABLE
	*	@param value
	*/
   public void setSyntaxPgmTable500(char[] value) {
      syntaxPgmTable500.setString(value); 
   }   
    
     /**
	 * 	Update SyntaxPgmTable500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmTable500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmTable500.begin,syntaxPgmTable500.length());
   }
   
     /**
	 * 	Update SyntaxPgmTable500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmTable500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmTable500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SyntaxPgmTable500 with another Field
	 *	@param value
	 */
   public void setSyntaxPgmTable500(Field source) {
   	replace(source,0,source.length(),syntaxPgmTable500.begin,syntaxPgmTable500.length());
   }  
   
     /**
	 * 	Update SyntaxPgmTable500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmTable500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmTable500.begin,syntaxPgmTable500.length());
   }
   
     /**
	 * 	Update SyntaxPgmTable500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmTable500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmTable500.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of syntaxPgmRedTable500
	 *	@return syntaxPgmRedTable500
	 */   
	 public SyntaxPgmRedTable500 getSyntaxPgmRedTable500() {
   	return syntaxPgmRedTable500;
   }
   /**
	* 	Update SyntaxPgmRedTable500 with the passed value
	*   Corresponding COBOL Variable is 500-SYNTAX-PGM-RED-TABLE
	*	@param value
	*/
   public void setSyntaxPgmRedTable500(char[] value) {
      syntaxPgmRedTable500.setString(value); 
   }   
    
     /**
	 * 	Update SyntaxPgmRedTable500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmRedTable500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmRedTable500.begin,syntaxPgmRedTable500.length());
   }
   
     /**
	 * 	Update SyntaxPgmRedTable500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmRedTable500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmRedTable500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SyntaxPgmRedTable500 with another Field
	 *	@param value
	 */
   public void setSyntaxPgmRedTable500(Field source) {
   	replace(source,0,source.length(),syntaxPgmRedTable500.begin,syntaxPgmRedTable500.length());
   }  
   
     /**
	 * 	Update SyntaxPgmRedTable500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSyntaxPgmRedTable500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmRedTable500.begin,syntaxPgmRedTable500.length());
   }
   
     /**
	 * 	Update SyntaxPgmRedTable500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxPgmRedTable500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,syntaxPgmRedTable500.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSyntaxPgmTableGroup500FieldLength() {
			return SYNTAX_PGM_TABLE_GROUP_500_LENGTH;
		}

}
  
