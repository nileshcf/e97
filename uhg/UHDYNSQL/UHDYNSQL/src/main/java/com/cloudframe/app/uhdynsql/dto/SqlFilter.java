package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilter is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlFilter extends SqlFilterSerialized { 
   
				private SqlFilterColor1Group sqlFilterColor1Group = new SqlFilterColor1Group();
				private SqlFilterColor2Group sqlFilterColor2Group = new SqlFilterColor2Group();
				private SqlFilterSupplierGroup sqlFilterSupplierGroup = new SqlFilterSupplierGroup();
	
	/**
	* Constructor for SqlFilter
	**/
    public SqlFilter() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sqlFilterColor1Group.setParent(this,getStartOffset() + 0);
	       			sqlFilterColor2Group.setParent(this,getStartOffset() + 7);
	       			sqlFilterSupplierGroup.setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sqlFilterColor1Group
	 *	@return sqlFilterColor1Group
	 */   
	 public SqlFilterColor1Group getSqlFilterColor1Group() {
   	return sqlFilterColor1Group;
   }
   /**
	* 	Update SqlFilterColor1Group with the passed value
	*   Corresponding COBOL Variable is WS-SQL-FILTER-COLOR1-GROUP
	*	@param value
	*/
   public void setSqlFilterColor1Group(char[] value) {
      sqlFilterColor1Group.setString(value); 
   }   
    
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor1Group.begin,sqlFilterColor1Group.length());
   }
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor1Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor1Group with another Field
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source) {
   	replace(source,0,source.length(),sqlFilterColor1Group.begin,sqlFilterColor1Group.length());
   }  
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor1Group.begin,sqlFilterColor1Group.length());
   }
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor1Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlFilterColor2Group
	 *	@return sqlFilterColor2Group
	 */   
	 public SqlFilterColor2Group getSqlFilterColor2Group() {
   	return sqlFilterColor2Group;
   }
   /**
	* 	Update SqlFilterColor2Group with the passed value
	*   Corresponding COBOL Variable is WS-SQL-FILTER-COLOR2-GROUP
	*	@param value
	*/
   public void setSqlFilterColor2Group(char[] value) {
      sqlFilterColor2Group.setString(value); 
   }   
    
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2Group(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor2Group.begin,sqlFilterColor2Group.length());
   }
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor2Group.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor2Group with another Field
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source) {
   	replace(source,0,source.length(),sqlFilterColor2Group.begin,sqlFilterColor2Group.length());
   }  
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor2Group.begin,sqlFilterColor2Group.length());
   }
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterColor2Group.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlFilterSupplierGroup
	 *	@return sqlFilterSupplierGroup
	 */   
	 public SqlFilterSupplierGroup getSqlFilterSupplierGroup() {
   	return sqlFilterSupplierGroup;
   }
   /**
	* 	Update SqlFilterSupplierGroup with the passed value
	*   Corresponding COBOL Variable is WS-SQL-FILTER-SUPPLIER-GROUP
	*	@param value
	*/
   public void setSqlFilterSupplierGroup(char[] value) {
      sqlFilterSupplierGroup.setString(value); 
   }   
    
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterSupplierGroup.begin,sqlFilterSupplierGroup.length());
   }
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterSupplierGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SqlFilterSupplierGroup with another Field
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source) {
   	replace(source,0,source.length(),sqlFilterSupplierGroup.begin,sqlFilterSupplierGroup.length());
   }  
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterSupplierGroup.begin,sqlFilterSupplierGroup.length());
   }
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlFilterSupplierGroup.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSqlFilterFieldLength() {
			return SQL_FILTER_LENGTH;
		}

}
  
