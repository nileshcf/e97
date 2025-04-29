package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec extends SortRecSerialized {
   
				private SortRec1 sortRec1 = new SortRec1();
				private SortRec4 sortRec4 = new SortRec4();
				private SortRec5 sortRec5 = new SortRec5();
	
	/**
	* Constructor for SortRec
	**/
    public SortRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sortRec1.setParent(this,getStartOffset() + 0);
	       			sortRec4.setParent(this,getStartOffset() + 0);
	       			sortRec5.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sortRec1
	 *	@return sortRec1
	 */   
	 public SortRec1 getSortRec1() {
   	return sortRec1;
   }
   /**
	* 	Update SortRec1 with the passed value
	*   Corresponding COBOL Variable is SORT-REC1
	*	@param value
	*/
   public void setSortRec1(char[] value) {
      sortRec1.setString(value); 
   }   
    
     /**
	 * 	Update SortRec1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSortRec1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec1.begin,sortRec1.length());
   }
   
     /**
	 * 	Update SortRec1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortRec1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SortRec1 with another Field
	 *	@param value
	 */
   public void setSortRec1(Field source) {
   	replace(source,0,source.length(),sortRec1.begin,sortRec1.length());
   }  
   
     /**
	 * 	Update SortRec1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSortRec1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec1.begin,sortRec1.length());
   }
   
     /**
	 * 	Update SortRec1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortRec1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sortRec4
	 *	@return sortRec4
	 */   
	 public SortRec4 getSortRec4() {
   	return sortRec4;
   }
   /**
	* 	Update SortRec4 with the passed value
	*   Corresponding COBOL Variable is SORT-REC4
	*	@param value
	*/
   public void setSortRec4(char[] value) {
      sortRec4.setString(value); 
   }   
    
     /**
	 * 	Update SortRec4 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSortRec4(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec4.begin,sortRec4.length());
   }
   
     /**
	 * 	Update SortRec4 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortRec4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec4.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SortRec4 with another Field
	 *	@param value
	 */
   public void setSortRec4(Field source) {
   	replace(source,0,source.length(),sortRec4.begin,sortRec4.length());
   }  
   
     /**
	 * 	Update SortRec4 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSortRec4(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec4.begin,sortRec4.length());
   }
   
     /**
	 * 	Update SortRec4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortRec4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec4.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sortRec5
	 *	@return sortRec5
	 */   
	 public SortRec5 getSortRec5() {
   	return sortRec5;
   }
   /**
	* 	Update SortRec5 with the passed value
	*   Corresponding COBOL Variable is SORT-REC5
	*	@param value
	*/
   public void setSortRec5(char[] value) {
      sortRec5.setString(value); 
   }   
    
     /**
	 * 	Update SortRec5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSortRec5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec5.begin,sortRec5.length());
   }
   
     /**
	 * 	Update SortRec5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortRec5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SortRec5 with another Field
	 *	@param value
	 */
   public void setSortRec5(Field source) {
   	replace(source,0,source.length(),sortRec5.begin,sortRec5.length());
   }  
   
     /**
	 * 	Update SortRec5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSortRec5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sortRec5.begin,sortRec5.length());
   }
   
     /**
	 * 	Update SortRec5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortRec5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sortRec5.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSortRecFieldLength() {
			return SORT_REC_LENGTH;
		}

}
  
