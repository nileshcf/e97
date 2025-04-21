package com.cloudframe.app.uhdynsql.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.uhdynsql.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] wfWidgetsFlag = Field.fillLowValue(1);

								private char[] sqlcodeDisp = Field.fillLowValue(4);

						private char[] wqSqlColorPred = new char[35];

						private char[] wqSqlSupplierPred = new char[35];

						private char[] wqSqlSelectClause = Field.fillLowValue(200);

						private char[] wqSqlFromClause = Field.fillLowValue(50);

						private char[] wqSqlPredicateClause = Field.fillLowValue(200);

						private char[] wqSqlOrderByClause = new char[25];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWqSqlColorPred(("   WHERE WIDGET_COLOR IN (?,?)     ").toCharArray());
								setWqSqlSupplierPred((" AND WIDGET_SUPPLIER NOT LIKE ?    ").toCharArray());
								setWqSqlOrderByClause(("ORDER BY WIDGET_NUM ASC  ").toCharArray());
    }


 

	/**
	 *	Returns the value of wfWidgetsFlag
	 *	@return wfWidgetsFlag
	 */
   public char[] getWfWidgetsFlag() throws CFException{
   		return wfWidgetsFlag;
   }

  
	/**
	*  set variable wfWidgetsFlag
	*  Corresponding COBOL Variable is WF-WIDGETS-FLAG
	*  @param value
	**/
   public void setWfWidgetsFlag(char[] value) {
       value = checkWfWidgetsFlagConstraints(value);
       arraycopy(value,0,wfWidgetsFlag,0,value.length);
   } 
	public void setWfWidgetsFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wfWidgetsFlag,0,beginIndex + endIndex);
   }
	char[] wfAllWidgetsFetched88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isWfAllWidgetsFetched()
	 *	@return  Returns true if isWfAllWidgetsFetched() is "A"
	 */
   public boolean isWfAllWidgetsFetched() throws CFException {
      return (  compareChars( getWfWidgetsFlag() , wfAllWidgetsFetched88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setWfAllWidgetsFetchedTrue() {  			
    	setWfWidgetsFlag( wfAllWidgetsFetched88Value);
   	}
	char[] wfStartFetchWidgets88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isWfStartFetchWidgets()
	 *	@return  Returns true if isWfStartFetchWidgets() is "F"
	 */
   public boolean isWfStartFetchWidgets() throws CFException {
      return (  compareChars( getWfWidgetsFlag() , wfStartFetchWidgets88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setWfStartFetchWidgetsTrue() {  			
    	setWfWidgetsFlag( wfStartFetchWidgets88Value);
   	}
	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException{
     if (isSqlcodeDispModified()) { 
        sqlcodeDisp = refreshSqlcodeDisp();
     }
   		return sqlcodeDisp;
   }

  
	/**
	*  set variable sqlcodeDisp
	*  Corresponding COBOL Variable is WS-SQLCODE-DISP
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) {
      sqlcodeDisp = checkSqlcodeDispConstraints(value);
      serializeSqlcodeDisp(sqlcodeDisp);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,sqlcodeDisp.length);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
       replace(source,0,source.length(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcodeDisp,SQLCODE_DISP_LEN);
   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wqSqlColorPred
	 *	@return wqSqlColorPred
	 */
   public char[] getWqSqlColorPred() throws CFException{
   		return wqSqlColorPred;
   }

  
	/**
	*  set variable wqSqlColorPred
	*  Corresponding COBOL Variable is WQ-SQL-COLOR-PRED
	*  @param value
	**/
   public void setWqSqlColorPred(char[] value) {
       value = checkWqSqlColorPredConstraints(value);
       arraycopy(value,0,wqSqlColorPred,0,value.length);
   } 
	public void setWqSqlColorPred(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlColorPred,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wqSqlSupplierPred
	 *	@return wqSqlSupplierPred
	 */
   public char[] getWqSqlSupplierPred() throws CFException{
   		return wqSqlSupplierPred;
   }

  
	/**
	*  set variable wqSqlSupplierPred
	*  Corresponding COBOL Variable is WQ-SQL-SUPPLIER-PRED
	*  @param value
	**/
   public void setWqSqlSupplierPred(char[] value) {
       value = checkWqSqlSupplierPredConstraints(value);
       arraycopy(value,0,wqSqlSupplierPred,0,value.length);
   } 
	public void setWqSqlSupplierPred(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlSupplierPred,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wqSqlSelectClause
	 *	@return wqSqlSelectClause
	 */
   public char[] getWqSqlSelectClause() throws CFException{
   		return wqSqlSelectClause;
   }

  
	/**
	*  set variable wqSqlSelectClause
	*  Corresponding COBOL Variable is WQ-SQL-SELECT-CLAUSE
	*  @param value
	**/
   public void setWqSqlSelectClause(char[] value) {
       value = checkWqSqlSelectClauseConstraints(value);
       arraycopy(value,0,wqSqlSelectClause,0,value.length);
   } 
	public void setWqSqlSelectClause(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlSelectClause,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wqSqlFromClause
	 *	@return wqSqlFromClause
	 */
   public char[] getWqSqlFromClause() throws CFException{
   		return wqSqlFromClause;
   }

  
	/**
	*  set variable wqSqlFromClause
	*  Corresponding COBOL Variable is WQ-SQL-FROM-CLAUSE
	*  @param value
	**/
   public void setWqSqlFromClause(char[] value) {
       value = checkWqSqlFromClauseConstraints(value);
       arraycopy(value,0,wqSqlFromClause,0,value.length);
   } 
	public void setWqSqlFromClause(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlFromClause,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wqSqlPredicateClause
	 *	@return wqSqlPredicateClause
	 */
   public char[] getWqSqlPredicateClause() throws CFException{
   		return wqSqlPredicateClause;
   }

  
	/**
	*  set variable wqSqlPredicateClause
	*  Corresponding COBOL Variable is WQ-SQL-PREDICATE-CLAUSE
	*  @param value
	**/
   public void setWqSqlPredicateClause(char[] value) {
       value = checkWqSqlPredicateClauseConstraints(value);
       arraycopy(value,0,wqSqlPredicateClause,0,value.length);
   } 
	public void setWqSqlPredicateClause(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlPredicateClause,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wqSqlOrderByClause
	 *	@return wqSqlOrderByClause
	 */
   public char[] getWqSqlOrderByClause() throws CFException{
   		return wqSqlOrderByClause;
   }

  
	/**
	*  set variable wqSqlOrderByClause
	*  Corresponding COBOL Variable is WQ-SQL-ORDER-BY-CLAUSE
	*  @param value
	**/
   public void setWqSqlOrderByClause(char[] value) {
       value = checkWqSqlOrderByClauseConstraints(value);
       arraycopy(value,0,wqSqlOrderByClause,0,value.length);
   } 
	public void setWqSqlOrderByClause(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wqSqlOrderByClause,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
