package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003008 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003008 extends ErrorMsg6003008Serialized {
   


						private char[] table6003008 = new char[21];


						private char[] maxSize6003008 = new char[8];
	
	/**
	* Constructor for ErrorMsg6003008
	**/
    public ErrorMsg6003008() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE ").toCharArray()
             , getStartOffset() + 0
             ,6
             );
								setTable6003008(fillSpace(21));
       replaceValue( // serialize and save the value
             (" EXCEEDED MAX SIZE OF ").toCharArray()
             , getStartOffset() + 27
             ,22
             );
								setMaxSize6003008(fillSpace(8));
    }


 

	/**
	 *	Returns the value of table6003008
	 *	@return table6003008
	 */
   public char[] getTable6003008() throws CFException{
     if (isTable6003008Modified()) { 
        table6003008 = refreshTable6003008();
     }
   		return table6003008;
   }

  
	/**
	*  set variable table6003008
	*  Corresponding COBOL Variable is 600-3008-TABLE
	*  @param value
	**/
   public void setTable6003008(char[] value) {
      table6003008 = checkTable6003008Constraints(value);
      serializeTable6003008(table6003008);
   } 

     /**
	 * 	Update Table6003008 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable6003008(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable6003008,table6003008.length);
   	
   }
   
   public void setTable6003008(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable6003008,table6003008.length);
   	
   }
   
     /**
	 * 	Update Table6003008 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable6003008(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable6003008+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table6003008 with another Field
	 *	@param value
	 */
   public void setTable6003008(Field source) {
       replace(source,0,source.length(),beginTable6003008,TABLE_6003008_LEN);
   	
   }  
   
     /**
	 * 	Update Table6003008 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable6003008(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable6003008,TABLE_6003008_LEN);
   	
   }
   
     /**
	 * 	Update Table6003008 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable6003008(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable6003008+targetIndex,targetLen);
    
   }
	char[] table1240200600300888Value = "500-1240200-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1240200-TBL-ITEMS" for isTable12402006003008()
	 *	@return  Returns true if isTable12402006003008() is "500-1240200-TBL-ITEMS"
	 */
   public boolean isTable12402006003008() throws CFException {
      return (  compareChars( getTable6003008() , table1240200600300888Value)  == 0  );
   }


	/**
	*  set values "500-1240200-TBL-ITEMS"
	*/
   	public void setTable12402006003008True() {  			
    	setTable6003008( table1240200600300888Value);
   	}
	char[] table1644695600300888Value = "500-1644695-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1644695-TBL-ITEMS" for isTable16446956003008()
	 *	@return  Returns true if isTable16446956003008() is "500-1644695-TBL-ITEMS"
	 */
   public boolean isTable16446956003008() throws CFException {
      return (  compareChars( getTable6003008() , table1644695600300888Value)  == 0  );
   }


	/**
	*  set values "500-1644695-TBL-ITEMS"
	*/
   	public void setTable16446956003008True() {  			
    	setTable6003008( table1644695600300888Value);
   	}
	char[] table1644697600300888Value = "500-1644697-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1644697-TBL-ITEMS" for isTable16446976003008()
	 *	@return  Returns true if isTable16446976003008() is "500-1644697-TBL-ITEMS"
	 */
   public boolean isTable16446976003008() throws CFException {
      return (  compareChars( getTable6003008() , table1644697600300888Value)  == 0  );
   }


	/**
	*  set values "500-1644697-TBL-ITEMS"
	*/
   	public void setTable16446976003008True() {  			
    	setTable6003008( table1644697600300888Value);
   	}
	char[] table1740783600300888Value = "500-1740783-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1740783-TBL-ITEMS" for isTable17407836003008()
	 *	@return  Returns true if isTable17407836003008() is "500-1740783-TBL-ITEMS"
	 */
   public boolean isTable17407836003008() throws CFException {
      return (  compareChars( getTable6003008() , table1740783600300888Value)  == 0  );
   }


	/**
	*  set values "500-1740783-TBL-ITEMS"
	*/
   	public void setTable17407836003008True() {  			
    	setTable6003008( table1740783600300888Value);
   	}
	char[] table1740790600300888Value = "500-1740790-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1740790-TBL-ITEMS" for isTable17407906003008()
	 *	@return  Returns true if isTable17407906003008() is "500-1740790-TBL-ITEMS"
	 */
   public boolean isTable17407906003008() throws CFException {
      return (  compareChars( getTable6003008() , table1740790600300888Value)  == 0  );
   }


	/**
	*  set values "500-1740790-TBL-ITEMS"
	*/
   	public void setTable17407906003008True() {  			
    	setTable6003008( table1740790600300888Value);
   	}
	char[] table1740791600300888Value = "500-1740791-TBL-ITEMS".toCharArray();
	/**
	 *	Test condition "500-1740791-TBL-ITEMS" for isTable17407916003008()
	 *	@return  Returns true if isTable17407916003008() is "500-1740791-TBL-ITEMS"
	 */
   public boolean isTable17407916003008() throws CFException {
      return (  compareChars( getTable6003008() , table1740791600300888Value)  == 0  );
   }


	/**
	*  set values "500-1740791-TBL-ITEMS"
	*/
   	public void setTable17407916003008True() {  			
    	setTable6003008( table1740791600300888Value);
   	}
	char[] tableComn600300888Value = "500-COMN-TBL-ITEMS   ".toCharArray();
	/**
	 *	Test condition "500-COMN-TBL-ITEMS" for isTableComn6003008()
	 *	@return  Returns true if isTableComn6003008() is "500-COMN-TBL-ITEMS"
	 */
   public boolean isTableComn6003008() throws CFException {
      return (  compareChars( getTable6003008() , tableComn600300888Value)  == 0  );
   }


	/**
	*  set values "500-COMN-TBL-ITEMS"
	*/
   	public void setTableComn6003008True() {  			
    	setTable6003008( tableComn600300888Value);
   	}
	/**
	 *	Returns the value of maxSize6003008
	 *	@return maxSize6003008
	 */
   public char[] getMaxSize6003008() throws CFException{
     if (isMaxSize6003008Modified()) { 
        maxSize6003008 = refreshMaxSize6003008();
     }
   		return maxSize6003008;
   }

  
	/**
	*  set variable maxSize6003008
	*  Corresponding COBOL Variable is 600-3008-MAX-SIZE
	*  @param value
	**/
   public void setMaxSize6003008(char[] value) {
      maxSize6003008 = checkMaxSize6003008Constraints(value);
      serializeMaxSize6003008(maxSize6003008);
   } 

     /**
	 * 	Update MaxSize6003008 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaxSize6003008(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMaxSize6003008,maxSize6003008.length);
   	
   }
   
   public void setMaxSize6003008(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMaxSize6003008,maxSize6003008.length);
   	
   }
   
     /**
	 * 	Update MaxSize6003008 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxSize6003008(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxSize6003008+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MaxSize6003008 with another Field
	 *	@param value
	 */
   public void setMaxSize6003008(Field source) {
       replace(source,0,source.length(),beginMaxSize6003008,MAX_SIZE_6003008_LEN);
   	
   }  
   
     /**
	 * 	Update MaxSize6003008 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaxSize6003008(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMaxSize6003008,MAX_SIZE_6003008_LEN);
   	
   }
   
     /**
	 * 	Update MaxSize6003008 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxSize6003008(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxSize6003008+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003008FieldLength() {
			return ERROR_MSG_6003008_LENGTH;
		}

}
  
