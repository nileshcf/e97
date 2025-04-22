package com.cloudframe.app.ip606130.file.records;

/**
*  The class SortRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec extends SortRecSerialized {
   
				private SortRec1 sortRec1 = new SortRec1();
	
	/**
	* Constructor for SortRec
	**/
    public SortRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sortRec1.setParent(this,getStartOffset() + 0);
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

	
	
	

		public static int getSortRecFieldLength() {
			return SORT_REC_LENGTH;
		}

}
  
