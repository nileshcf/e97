package com.cloudframe.app.uhdynsql;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.uhdynsql.dto.SqlFilterSupplierGroup;
import com.cloudframe.app.uhdynsql.dto.Sqlvar1;
import java.sql.ResultSet;
import com.cloudframe.app.uhdynsql.dto.SqlFilterColor1Group;
import com.cloudframe.app.uhdynsql.dto.SqlFilter;
import com.cloudframe.app.uhdynsql.dto.SqlFilterColor2Group;
import com.cloudframe.app.uhdynsql.dto.Tbxmlwgt;
import com.cloudframe.app.uhdynsql.dto.Sqlda;
import com.cloudframe.app.uhdynsql.dto.Sqlca;
import com.cloudframe.app.uhdynsql.dto.Work;
import com.cloudframe.app.uhdynsql.dto.WqSqlFullClause;
import com.cloudframe.app.uhdynsql.dto.Sqlwarn;


@Context
public class UhdynsqlCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WqSqlFullClause wqSqlFullClause;
    Tbxmlwgt tbxmlwgt;
    Sqlda sqlda;
    SqlFilter sqlFilter;
    Sqlca sqlca;
    Work work;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }


    ResultSet widgetCsrResultSet;

    public ResultSet getWidgetCsrResultSet() {
        return this.widgetCsrResultSet;
    }

    public void setWidgetCsrResultSet(ResultSet widgetCsrResultSet) {
        this.widgetCsrResultSet = widgetCsrResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }

    boolean doNotSkipPrepareAndOpen = true;

    public boolean getDoNotSkipPrepareAndOpen() {
        return this.doNotSkipPrepareAndOpen;
    }

    public void setDoNotSkipPrepareAndOpen(boolean doNotSkipPrepareAndOpen) {
            this.doNotSkipPrepareAndOpen = doNotSkipPrepareAndOpen;
        }
    boolean doNotSkipFetchAndPrintWidgets = true;

    public boolean getDoNotSkipFetchAndPrintWidgets() {
        return this.doNotSkipFetchAndPrintWidgets;
    }

    public void setDoNotSkipFetchAndPrintWidgets(boolean doNotSkipFetchAndPrintWidgets) {
            this.doNotSkipFetchAndPrintWidgets = doNotSkipFetchAndPrintWidgets;
        }
    boolean doNotSkipFetchWidgets = true;

    public boolean getDoNotSkipFetchWidgets() {
        return this.doNotSkipFetchWidgets;
    }

    public void setDoNotSkipFetchWidgets(boolean doNotSkipFetchWidgets) {
            this.doNotSkipFetchWidgets = doNotSkipFetchWidgets;
        }
    boolean doNotSkipCloseWidgets = true;

    public boolean getDoNotSkipCloseWidgets() {
        return this.doNotSkipCloseWidgets;
    }

    public void setDoNotSkipCloseWidgets(boolean doNotSkipCloseWidgets) {
            this.doNotSkipCloseWidgets = doNotSkipCloseWidgets;
        }

    public WqSqlFullClause getWqSqlFullClause() {
        if (wqSqlFullClause == null) {
            wqSqlFullClause = new WqSqlFullClause();
        }

        return wqSqlFullClause;
    }

    public void setWqSqlFullClause(WqSqlFullClause wqSqlFullClause) {
        this.wqSqlFullClause = wqSqlFullClause;
    }
    public Tbxmlwgt getTbxmlwgt() {
        if (tbxmlwgt == null) {
            tbxmlwgt = new Tbxmlwgt();
        }

        return tbxmlwgt;
    }

    public void setTbxmlwgt(Tbxmlwgt tbxmlwgt) {
        this.tbxmlwgt = tbxmlwgt;
    }
    public Sqlda getSqlda() {
        if (sqlda == null) {
            sqlda = new Sqlda();
        }

        return sqlda;
    }

    public void setSqlda(Sqlda sqlda) {
        this.sqlda = sqlda;
    }
    public SqlFilter getSqlFilter() {
        if (sqlFilter == null) {
            sqlFilter = new SqlFilter();
        }

        return sqlFilter;
    }

    public void setSqlFilter(SqlFilter sqlFilter) {
        this.sqlFilter = sqlFilter;
    }
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += tbxmlwgt.hashCode();
        str += sqlda.hashCode();
        str += sqlFilter.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UhdynsqlCtx clone() {
        UhdynsqlCtx cloneObj = new UhdynsqlCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.sqlda = new Sqlda();
        cloneObj.sqlda.set(sqlda.getClonedField());
        cloneObj.sqlFilter = new SqlFilter();
        cloneObj.sqlFilter.set(sqlFilter.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainInCtx implements Cloneable {
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Test condition "A" for isWfAllWidgetsFetched()
	 *	@return  Returns true if isWfAllWidgetsFetched() is "A"
	 */
   public boolean isWfAllWidgetsFetched() throws CFException {
      return work.isWfAllWidgetsFetched();
   }

	/**
	*  set values "A"
	*/
   	public void setWfAllWidgetsFetchedTrue()  throws CFException{  			
    	work.setWfAllWidgetsFetchedTrue();
   	}

        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     WqSqlFullClause wqSqlFullClause = UhdynsqlCtx.this.getWqSqlFullClause();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of wqSqlFullClause
	 *	@return wqSqlFullClause
	 */   
	 public WqSqlFullClause getWqSqlFullClause() {
   	return wqSqlFullClause;
   }


	/**
	 *	Returns the value of wqSqlSelectClause
	 *	@return wqSqlSelectClause
	 */
   public char[] getWqSqlSelectClause() throws CFException  {              
   		return work.getWqSqlSelectClause();
   }

  
	/**
	*  set variable wqSqlSelectClause
	*  @param value
	**/
   public void setWqSqlSelectClause(char[] value) throws CFException {
      work.setWqSqlSelectClause(value);
   } 

	/**
	 *	Test condition "F" for isWfStartFetchWidgets()
	 *	@return  Returns true if isWfStartFetchWidgets() is "F"
	 */
   public boolean isWfStartFetchWidgets() throws CFException {
      return work.isWfStartFetchWidgets();
   }

	/**
	*  set values "F"
	*/
   	public void setWfStartFetchWidgetsTrue()  throws CFException{  			
    	work.setWfStartFetchWidgetsTrue();
   	}
	/**
	 *	Returns the value of wqSqlPredicateClause
	 *	@return wqSqlPredicateClause
	 */
   public char[] getWqSqlPredicateClause() throws CFException  {              
   		return work.getWqSqlPredicateClause();
   }

  
	/**
	*  set variable wqSqlPredicateClause
	*  @param value
	**/
   public void setWqSqlPredicateClause(char[] value) throws CFException {
      work.setWqSqlPredicateClause(value);
   } 

	/**
	 *	Returns the value of wqSqlFromClause
	 *	@return wqSqlFromClause
	 */
   public char[] getWqSqlFromClause() throws CFException  {              
   		return work.getWqSqlFromClause();
   }

  
	/**
	*  set variable wqSqlFromClause
	*  @param value
	**/
   public void setWqSqlFromClause(char[] value) throws CFException {
      work.setWqSqlFromClause(value);
   } 


        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class BuildSqlInCtx implements Cloneable {
     WqSqlFullClause wqSqlFullClause = UhdynsqlCtx.this.getWqSqlFullClause();
     SqlFilter sqlFilter = UhdynsqlCtx.this.getSqlFilter();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of wqSqlColorPred
	 *	@return wqSqlColorPred
	 */
   public char[] getWqSqlColorPred() throws CFException  {              
   		return work.getWqSqlColorPred();
   }

  
	/**
	*  set variable wqSqlColorPred
	*  @param value
	**/
   public void setWqSqlColorPred(char[] value) throws CFException {
      work.setWqSqlColorPred(value);
   } 

	/**
	 *	Returns the value of wqSqlOrderByClause
	 *	@return wqSqlOrderByClause
	 */
   public char[] getWqSqlOrderByClause() throws CFException  {              
   		return work.getWqSqlOrderByClause();
   }

  
	/**
	*  set variable wqSqlOrderByClause
	*  @param value
	**/
   public void setWqSqlOrderByClause(char[] value) throws CFException {
      work.setWqSqlOrderByClause(value);
   } 

	/**
	 *	Returns the value of wqSqlSupplierPred
	 *	@return wqSqlSupplierPred
	 */
   public char[] getWqSqlSupplierPred() throws CFException  {              
   		return work.getWqSqlSupplierPred();
   }

  
	/**
	*  set variable wqSqlSupplierPred
	*  @param value
	**/
   public void setWqSqlSupplierPred(char[] value) throws CFException {
      work.setWqSqlSupplierPred(value);
   } 


        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }

        public BuildSqlOutCtx getBuildSqlOutCtx() {
            return new BuildSqlOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += sqlFilter.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public BuildSqlInCtx clone() {
        BuildSqlInCtx cloneObj = new BuildSqlInCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.sqlFilter = new SqlFilter();
        cloneObj.sqlFilter.set(sqlFilter.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildSqlInCtx getBuildSqlInCtx() {
            return new BuildSqlInCtx();
    }
     public class BuildSqlOutCtx implements Cloneable {
     WqSqlFullClause wqSqlFullClause = UhdynsqlCtx.this.getWqSqlFullClause();
     SqlFilter sqlFilter = UhdynsqlCtx.this.getSqlFilter();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of sqlFilterSupplier
	 *	@return sqlFilterSupplier
	 */
   public char[] getSqlFilterSupplier() throws CFException  {              
   		return sqlFilter.getSqlFilterSupplierGroup().getSqlFilterSupplier();
   }

  
	/**
	*  set variable sqlFilterSupplier
	*  @param value
	**/
   public void setSqlFilterSupplier(char[] value) throws CFException {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(value);
   } 

     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex);
   	
   }
   
   public void setSqlFilterSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterSupplier with another Field
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source);
   }  
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlFilterColor1
	 *	@return sqlFilterColor1
	 */
   public char[] getSqlFilterColor1() throws CFException  {              
   		return sqlFilter.getSqlFilterColor1Group().getSqlFilterColor1();
   }

  
	/**
	*  set variable sqlFilterColor1
	*  @param value
	**/
   public void setSqlFilterColor1(char[] value) throws CFException {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(value);
   } 

     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex);
   	
   }
   
   public void setSqlFilterColor1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor1 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source);
   }  
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wqSqlSelectClause
	 *	@return wqSqlSelectClause
	 */
   public char[] getWqSqlSelectClause() throws CFException  {              
   		return work.getWqSqlSelectClause();
   }

  
	/**
	*  set variable wqSqlSelectClause
	*  @param value
	**/
   public void setWqSqlSelectClause(char[] value) throws CFException {
      work.setWqSqlSelectClause(value);
   } 

	/**
	 *	Returns the value of wqSqlFullClauseText
	 *	@return wqSqlFullClauseText
	 */
   public char[] getWqSqlFullClauseText() throws CFException  {              
   		return wqSqlFullClause.getWqSqlFullClauseText();
   }

  
	/**
	*  set variable wqSqlFullClauseText
	*  @param value
	**/
   public void setWqSqlFullClauseText(char[] value) throws CFException {
      wqSqlFullClause.setWqSqlFullClauseText(value);
   } 

     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex) throws CFException {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex);
   	
   }
   
   public void setWqSqlFullClauseText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WqSqlFullClauseText with another Field
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source) {
      wqSqlFullClause.setWqSqlFullClauseText(source);
   }  
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wqSqlFullClauseLen
	 *	@return wqSqlFullClauseLen
	 */
	public short getWqSqlFullClauseLen() throws CFException {        
   		return wqSqlFullClause.getWqSqlFullClauseLen();
	}
	
	/**
	 * 	Update WqSqlFullClauseLen with the passed value
	 *	@param number
	 */
	public void setWqSqlFullClauseLen(short number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen(number);
	}

	public void setWqSqlFullClauseLen(int number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen((short)number);
	}

	public void setWqSqlFullClauseLen(long number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen((short)number);
	}



	/**
	 *	Returns the value of sqlFilter
	 *	@return sqlFilter
	 */   
	 public SqlFilter getSqlFilter() {
   	return sqlFilter;
   }


	/**
	 *	Returns the value of sqlFilterColor2
	 *	@return sqlFilterColor2
	 */
   public char[] getSqlFilterColor2() throws CFException  {              
   		return sqlFilter.getSqlFilterColor2Group().getSqlFilterColor2();
   }

  
	/**
	*  set variable sqlFilterColor2
	*  @param value
	**/
   public void setSqlFilterColor2(char[] value) throws CFException {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(value);
   } 

     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex);
   	
   }
   
   public void setSqlFilterColor2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor2 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source);
   }  
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wqSqlPredicateClause
	 *	@return wqSqlPredicateClause
	 */
   public char[] getWqSqlPredicateClause() throws CFException  {              
   		return work.getWqSqlPredicateClause();
   }

  
	/**
	*  set variable wqSqlPredicateClause
	*  @param value
	**/
   public void setWqSqlPredicateClause(char[] value) throws CFException {
      work.setWqSqlPredicateClause(value);
   } 

	/**
	 *	Returns the value of wqSqlFromClause
	 *	@return wqSqlFromClause
	 */
   public char[] getWqSqlFromClause() throws CFException  {              
   		return work.getWqSqlFromClause();
   }

  
	/**
	*  set variable wqSqlFromClause
	*  @param value
	**/
   public void setWqSqlFromClause(char[] value) throws CFException {
      work.setWqSqlFromClause(value);
   } 


        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += sqlFilter.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public BuildSqlOutCtx clone() {
        BuildSqlOutCtx cloneObj = new BuildSqlOutCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.sqlFilter = new SqlFilter();
        cloneObj.sqlFilter.set(sqlFilter.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildSqlOutCtx getBuildSqlOutCtx() {
            return new BuildSqlOutCtx();
    }
     public class PrepareAndOpenInCtx implements Cloneable {
     WqSqlFullClause wqSqlFullClause = UhdynsqlCtx.this.getWqSqlFullClause();
     Sqlda sqlda = UhdynsqlCtx.this.getSqlda();
     SqlFilter sqlFilter = UhdynsqlCtx.this.getSqlFilter();
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of wqSqlFullClause
	 *	@return wqSqlFullClause
	 */   
	 public WqSqlFullClause getWqSqlFullClause() {
   	return wqSqlFullClause;
   }


	/**
	 *	Returns the value of sqln
	 *	@return sqln
	 */
	public short getSqln() throws CFException {        
   		return sqlda.getSqln();
	}
	
	/**
	 * 	Update Sqln with the passed value
	 *	@param number
	 */
	public void setSqln(short number)  throws CFException{
		sqlda.setSqln(number);
	}

	public void setSqln(int number)  throws CFException{
		sqlda.setSqln((short)number);
	}

	public void setSqln(long number)  throws CFException{
		sqlda.setSqln((short)number);
	}



	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqld
	 *	@return sqld
	 */
	public short getSqld() throws CFException {        
   		return sqlda.getSqld();
	}
	
	/**
	 * 	Update Sqld with the passed value
	 *	@param number
	 */
	public void setSqld(short number)  throws CFException{
		sqlda.setSqld(number);
	}

	public void setSqld(int number)  throws CFException{
		sqlda.setSqld((short)number);
	}

	public void setSqld(long number)  throws CFException{
		sqlda.setSqld((short)number);
	}



	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlvar1
	 *	@return sqlvar1
	 */   
	 public Sqlvar1 getSqlvar1(int index) {
   	return sqlda.getSqlvar(index).getSqlvar1();
   }

   /**
	* 	Update Sqlvar1 with the passed value
	*	@param value
	*/
   public void setSqlvar1(int index,char[] value) throws CFException {
      sqlda.getSqlvar(index).setSqlvar1(value);
   }   

     /**
	 * 	Update Sqlvar1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlvar1(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlda.getSqlvar(index).setSqlvar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlvar1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar1(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlda.getSqlvar(index).setSqlvar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlvar1 with another Field
	 *	@param value
	 */
   public void setSqlvar1(int index,Field source) {
   	sqlda.getSqlvar(index).setSqlvar1(source);
   }  
   
     /**
	 * 	Update Sqlvar1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlvar1(int index,Field source, int sourceIndex,int sourceLen) {
   	sqlda.getSqlvar(index).setSqlvar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlvar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlvar1(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlda.getSqlvar(index).setSqlvar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wqSqlFullClauseText
	 *	@return wqSqlFullClauseText
	 */
   public char[] getWqSqlFullClauseText() throws CFException  {              
   		return wqSqlFullClause.getWqSqlFullClauseText();
   }

  
	/**
	*  set variable wqSqlFullClauseText
	*  @param value
	**/
   public void setWqSqlFullClauseText(char[] value) throws CFException {
      wqSqlFullClause.setWqSqlFullClauseText(value);
   } 

     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex) throws CFException {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex);
   	
   }
   
   public void setWqSqlFullClauseText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WqSqlFullClauseText with another Field
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source) {
      wqSqlFullClause.setWqSqlFullClauseText(source);
   }  
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WqSqlFullClauseText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWqSqlFullClauseText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wqSqlFullClause.setWqSqlFullClauseText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqldabc
	 *	@return sqldabc
	 */
	public int getSqldabc() throws CFException {        
   		return sqlda.getSqldabc();
	}
	
	/**
	 * 	Update Sqldabc with the passed value
	 *	@param number
	 */
	public void setSqldabc(int number)  throws CFException{
		sqlda.setSqldabc(number);
	}


	public void setSqldabc(long number)  throws CFException{
		sqlda.setSqldabc((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlFilterSupplier
	 *	@return sqlFilterSupplier
	 */
   public char[] getSqlFilterSupplier() throws CFException  {              
   		return sqlFilter.getSqlFilterSupplierGroup().getSqlFilterSupplier();
   }

  
	/**
	*  set variable sqlFilterSupplier
	*  @param value
	**/
   public void setSqlFilterSupplier(char[] value) throws CFException {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(value);
   } 

     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex);
   	
   }
   
   public void setSqlFilterSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterSupplier with another Field
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source);
   }  
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterSupplierGroup().setSqlFilterSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlFilterSupplierGroup
	 *	@return sqlFilterSupplierGroup
	 */   
	 public SqlFilterSupplierGroup getSqlFilterSupplierGroup() {
   	return sqlFilter.getSqlFilterSupplierGroup();
   }

   /**
	* 	Update SqlFilterSupplierGroup with the passed value
	*	@param value
	*/
   public void setSqlFilterSupplierGroup(char[] value) throws CFException {
      sqlFilter.setSqlFilterSupplierGroup(value);
   }   

     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlFilter.setSqlFilterSupplierGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterSupplierGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterSupplierGroup with another Field
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source) {
   	sqlFilter.setSqlFilterSupplierGroup(source);
   }  
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source, int sourceIndex,int sourceLen) {
   	sqlFilter.setSqlFilterSupplierGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterSupplierGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterSupplierGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterSupplierGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqldaid
	 *	@return sqldaid
	 */
   public char[] getSqldaid() throws CFException  {              
   		return sqlda.getSqldaid();
   }

  
	/**
	*  set variable sqldaid
	*  @param value
	**/
   public void setSqldaid(char[] value) throws CFException {
      sqlda.setSqldaid(value);
   } 

     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex) throws CFException {
      sqlda.setSqldaid(source, sourceIndex);
   	
   }
   
   public void setSqldaid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlda.setSqldaid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqldaid with another Field
	 *	@param value
	 */
   public void setSqldaid(Field source) {
      sqlda.setSqldaid(source);
   }  
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlFilterColor1
	 *	@return sqlFilterColor1
	 */
   public char[] getSqlFilterColor1() throws CFException  {              
   		return sqlFilter.getSqlFilterColor1Group().getSqlFilterColor1();
   }

  
	/**
	*  set variable sqlFilterColor1
	*  @param value
	**/
   public void setSqlFilterColor1(char[] value) throws CFException {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(value);
   } 

     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex);
   	
   }
   
   public void setSqlFilterColor1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor1 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source);
   }  
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterColor1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor1Group().setSqlFilterColor1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlFilterColor1Group
	 *	@return sqlFilterColor1Group
	 */   
	 public SqlFilterColor1Group getSqlFilterColor1Group() {
   	return sqlFilter.getSqlFilterColor1Group();
   }

   /**
	* 	Update SqlFilterColor1Group with the passed value
	*	@param value
	*/
   public void setSqlFilterColor1Group(char[] value) throws CFException {
      sqlFilter.setSqlFilterColor1Group(value);
   }   

     /**
	 * 	Update SqlFilterColor1Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1Group(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlFilter.setSqlFilterColor1Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterColor1Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor1Group with another Field
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source) {
   	sqlFilter.setSqlFilterColor1Group(source);
   }  
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source, int sourceIndex,int sourceLen) {
   	sqlFilter.setSqlFilterColor1Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor1Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor1Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterColor1Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wqSqlFullClauseLen
	 *	@return wqSqlFullClauseLen
	 */
	public short getWqSqlFullClauseLen() throws CFException {        
   		return wqSqlFullClause.getWqSqlFullClauseLen();
	}
	
	/**
	 * 	Update WqSqlFullClauseLen with the passed value
	 *	@param number
	 */
	public void setWqSqlFullClauseLen(short number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen(number);
	}

	public void setWqSqlFullClauseLen(int number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen((short)number);
	}

	public void setWqSqlFullClauseLen(long number)  throws CFException{
		wqSqlFullClause.setWqSqlFullClauseLen((short)number);
	}



	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of sqlFilterColor2Group
	 *	@return sqlFilterColor2Group
	 */   
	 public SqlFilterColor2Group getSqlFilterColor2Group() {
   	return sqlFilter.getSqlFilterColor2Group();
   }

   /**
	* 	Update SqlFilterColor2Group with the passed value
	*	@param value
	*/
   public void setSqlFilterColor2Group(char[] value) throws CFException {
      sqlFilter.setSqlFilterColor2Group(value);
   }   

     /**
	 * 	Update SqlFilterColor2Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2Group(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlFilter.setSqlFilterColor2Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2Group(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterColor2Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor2Group with another Field
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source) {
   	sqlFilter.setSqlFilterColor2Group(source);
   }  
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source, int sourceIndex,int sourceLen) {
   	sqlFilter.setSqlFilterColor2Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor2Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2Group(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlFilter.setSqlFilterColor2Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlFilterColor2
	 *	@return sqlFilterColor2
	 */
   public char[] getSqlFilterColor2() throws CFException  {              
   		return sqlFilter.getSqlFilterColor2Group().getSqlFilterColor2();
   }

  
	/**
	*  set variable sqlFilterColor2
	*  @param value
	**/
   public void setSqlFilterColor2(char[] value) throws CFException {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(value);
   } 

     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex) throws CFException {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex);
   	
   }
   
   public void setSqlFilterColor2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlFilterColor2 with another Field
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source);
   }  
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlFilterColor2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlFilterColor2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlFilter.getSqlFilterColor2Group().setSqlFilterColor2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }

        public PrepareAndOpenOutCtx getPrepareAndOpenOutCtx() {
            return new PrepareAndOpenOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += sqlda.hashCode();
        str += sqlFilter.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrepareAndOpenInCtx clone() {
        PrepareAndOpenInCtx cloneObj = new PrepareAndOpenInCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.sqlda = new Sqlda();
        cloneObj.sqlda.set(sqlda.getClonedField());
        cloneObj.sqlFilter = new SqlFilter();
        cloneObj.sqlFilter.set(sqlFilter.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrepareAndOpenInCtx getPrepareAndOpenInCtx() {
            return new PrepareAndOpenInCtx();
    }
     public class PrepareAndOpenOutCtx implements Cloneable {
     WqSqlFullClause wqSqlFullClause = UhdynsqlCtx.this.getWqSqlFullClause();
     Sqlda sqlda = UhdynsqlCtx.this.getSqlda();
     SqlFilter sqlFilter = UhdynsqlCtx.this.getSqlFilter();
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of sqln
	 *	@return sqln
	 */
	public short getSqln() throws CFException {        
   		return sqlda.getSqln();
	}
	
	/**
	 * 	Update Sqln with the passed value
	 *	@param number
	 */
	public void setSqln(short number)  throws CFException{
		sqlda.setSqln(number);
	}

	public void setSqln(int number)  throws CFException{
		sqlda.setSqln((short)number);
	}

	public void setSqln(long number)  throws CFException{
		sqlda.setSqln((short)number);
	}



	/**
	 *	Returns the value of sqltype
	 *	@return sqltype
	 */
	public short getSqltype(int index) throws CFException {        
   		return sqlda.getSqlvar(index).getSqlvar1().getSqltype();
	}
	
	/**
	 * 	Update Sqltype with the passed value
	 *	@param number
	 */
	public void setSqltype(int index,short number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqltype(number);
	}

	public void setSqltype(int index,int number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqltype((short)number);
	}

	public void setSqltype(int index,long number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqltype((short)number);
	}



	/**
	 *	Returns the value of sqld
	 *	@return sqld
	 */
	public short getSqld() throws CFException {        
   		return sqlda.getSqld();
	}
	
	/**
	 * 	Update Sqld with the passed value
	 *	@param number
	 */
	public void setSqld(short number)  throws CFException{
		sqlda.setSqld(number);
	}

	public void setSqld(int number)  throws CFException{
		sqlda.setSqld((short)number);
	}

	public void setSqld(long number)  throws CFException{
		sqlda.setSqld((short)number);
	}



	/**
	 *	Returns the value of sqldaid
	 *	@return sqldaid
	 */
   public char[] getSqldaid() throws CFException  {              
   		return sqlda.getSqldaid();
   }

  
	/**
	*  set variable sqldaid
	*  @param value
	**/
   public void setSqldaid(char[] value) throws CFException {
      sqlda.setSqldaid(value);
   } 

     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex) throws CFException {
      sqlda.setSqldaid(source, sourceIndex);
   	
   }
   
   public void setSqldaid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlda.setSqldaid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqldaid with another Field
	 *	@param value
	 */
   public void setSqldaid(Field source) {
      sqlda.setSqldaid(source);
   }  
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlda.setSqldaid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqllen
	 *	@return sqllen
	 */
	public short getSqllen(int index) throws CFException {        
   		return sqlda.getSqlvar(index).getSqlvar1().getSqllen();
	}
	
	/**
	 * 	Update Sqllen with the passed value
	 *	@param number
	 */
	public void setSqllen(int index,short number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqllen(number);
	}

	public void setSqllen(int index,int number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqllen((short)number);
	}

	public void setSqllen(int index,long number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqllen((short)number);
	}



	/**
	 *	Returns the value of sqldata
	 *	@return sqldata
	 */
	public int getSqldata(int index) throws CFException {        
   		return sqlda.getSqlvar(index).getSqlvar1().getSqldata();
	}
	
	/**
	 * 	Update Sqldata with the passed value
	 *	@param number
	 */
	public void setSqldata(int index,int number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqldata(number);
	}


	public void setSqldata(int index,long number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqldata((int)number);
	}


	/**
	 *	Returns the value of sqlind
	 *	@return sqlind
	 */
	public int getSqlind(int index) throws CFException {        
   		return sqlda.getSqlvar(index).getSqlvar1().getSqlind();
	}
	
	/**
	 * 	Update Sqlind with the passed value
	 *	@param number
	 */
	public void setSqlind(int index,int number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqlind(number);
	}


	public void setSqlind(int index,long number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().setSqlind((int)number);
	}


	/**
	 *	Returns the value of sqldabc
	 *	@return sqldabc
	 */
	public int getSqldabc() throws CFException {        
   		return sqlda.getSqldabc();
	}
	
	/**
	 * 	Update Sqldabc with the passed value
	 *	@param number
	 */
	public void setSqldabc(int number)  throws CFException{
		sqlda.setSqldabc(number);
	}


	public void setSqldabc(long number)  throws CFException{
		sqlda.setSqldabc((int)number);
	}


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlnamel
	 *	@return sqlnamel
	 */
	public short getSqlnamel(int index) throws CFException {        
   		return sqlda.getSqlvar(index).getSqlvar1().getSqlname().getSqlnamel();
	}
	
	/**
	 * 	Update Sqlnamel with the passed value
	 *	@param number
	 */
	public void setSqlnamel(int index,short number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().getSqlname().setSqlnamel(number);
	}

	public void setSqlnamel(int index,int number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().getSqlname().setSqlnamel((short)number);
	}

	public void setSqlnamel(int index,long number)  throws CFException{
		sqlda.getSqlvar(index).getSqlvar1().getSqlname().setSqlnamel((short)number);
	}




        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wqSqlFullClause.hashCode();
        str += sqlda.hashCode();
        str += sqlFilter.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrepareAndOpenOutCtx clone() {
        PrepareAndOpenOutCtx cloneObj = new PrepareAndOpenOutCtx();
        cloneObj.wqSqlFullClause = new WqSqlFullClause();
        cloneObj.wqSqlFullClause.set(wqSqlFullClause.getClonedField());
        cloneObj.sqlda = new Sqlda();
        cloneObj.sqlda.set(sqlda.getClonedField());
        cloneObj.sqlFilter = new SqlFilter();
        cloneObj.sqlFilter.set(sqlFilter.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrepareAndOpenOutCtx getPrepareAndOpenOutCtx() {
            return new PrepareAndOpenOutCtx();
    }
     public class FetchAndPrintWidgetsInCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = UhdynsqlCtx.this.getTbxmlwgt();

	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException  {              
   		return tbxmlwgt.getWidgetManuPlant();
   }

  
	/**
	*  set variable widgetManuPlant
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) throws CFException {
      tbxmlwgt.setWidgetManuPlant(value);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
      tbxmlwgt.setWidgetManuPlant(source);
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbxmlwgt.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbxmlwgt.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbxmlwgt.setWidgetPrice(number);
   }

	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbxmlwgt.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbxmlwgt.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbxmlwgt.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbxmlwgt.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbxmlwgt.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbxmlwgt.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWidgetManuCost() throws CFException{      
   		return tbxmlwgt.getWidgetManuCost();
	}

    public char[] getWidgetManuCostString() throws CFException {
          return  tbxmlwgt.getWidgetManuCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number)  throws CFException{
		tbxmlwgt.setWidgetManuCost(number);
   }

	/**
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {        
   		return tbxmlwgt.getWidgetLeadTime();
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *	@param number
	 */
	public void setWidgetLeadTime(short number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime(number);
	}

	public void setWidgetLeadTime(int number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime((short)number);
	}

	public void setWidgetLeadTime(long number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime((short)number);
	}



	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbxmlwgt.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbxmlwgt.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbxmlwgt.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbxmlwgt.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbxmlwgt.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbxmlwgt.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbxmlwgt.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbxmlwgt.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbxmlwgt.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
       return str.hashCode();
    }

    public FetchAndPrintWidgetsInCtx clone() {
        FetchAndPrintWidgetsInCtx cloneObj = new FetchAndPrintWidgetsInCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        return cloneObj;
    }

    }

    public FetchAndPrintWidgetsInCtx getFetchAndPrintWidgetsInCtx() {
            return new FetchAndPrintWidgetsInCtx();
    }
     public class FetchWidgetsInCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = UhdynsqlCtx.this.getTbxmlwgt();
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException  {              
   		return tbxmlwgt.getWidgetManuPlant();
   }

  
	/**
	*  set variable widgetManuPlant
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) throws CFException {
      tbxmlwgt.setWidgetManuPlant(value);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
      tbxmlwgt.setWidgetManuPlant(source);
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbxmlwgt.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbxmlwgt.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbxmlwgt.setWidgetPrice(number);
   }

	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbxmlwgt.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbxmlwgt.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbxmlwgt.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	public BigDecimal getWidgetManuCost() throws CFException{      
   		return tbxmlwgt.getWidgetManuCost();
	}

    public char[] getWidgetManuCostString() throws CFException {
          return  tbxmlwgt.getWidgetManuCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number)  throws CFException{
		tbxmlwgt.setWidgetManuCost(number);
   }

	/**
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {        
   		return tbxmlwgt.getWidgetLeadTime();
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *	@param number
	 */
	public void setWidgetLeadTime(short number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime(number);
	}

	public void setWidgetLeadTime(int number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime((short)number);
	}

	public void setWidgetLeadTime(long number)  throws CFException{
		tbxmlwgt.setWidgetLeadTime((short)number);
	}



	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbxmlwgt.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbxmlwgt.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbxmlwgt.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbxmlwgt.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbxmlwgt.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbxmlwgt.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbxmlwgt.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbxmlwgt.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbxmlwgt.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbxmlwgt.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbxmlwgt.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbxmlwgt.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }

        public FetchWidgetsOutCtx getFetchWidgetsOutCtx() {
            return new FetchWidgetsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FetchWidgetsInCtx clone() {
        FetchWidgetsInCtx cloneObj = new FetchWidgetsInCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FetchWidgetsInCtx getFetchWidgetsInCtx() {
            return new FetchWidgetsInCtx();
    }
     public class FetchWidgetsOutCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = UhdynsqlCtx.this.getTbxmlwgt();
     Work work = UhdynsqlCtx.this.getWork();
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Test condition "A" for isWfAllWidgetsFetched()
	 *	@return  Returns true if isWfAllWidgetsFetched() is "A"
	 */
   public boolean isWfAllWidgetsFetched() throws CFException {
      return work.isWfAllWidgetsFetched();
   }

	/**
	*  set values "A"
	*/
   	public void setWfAllWidgetsFetchedTrue()  throws CFException{  			
    	work.setWfAllWidgetsFetchedTrue();
   	}
	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public FetchWidgetsOutCtx clone() {
        FetchWidgetsOutCtx cloneObj = new FetchWidgetsOutCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public FetchWidgetsOutCtx getFetchWidgetsOutCtx() {
            return new FetchWidgetsOutCtx();
    }
     public class CloseWidgetsInCtx implements Cloneable {
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }

        public CloseWidgetsOutCtx getCloseWidgetsOutCtx() {
            return new CloseWidgetsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseWidgetsInCtx clone() {
        CloseWidgetsInCtx cloneObj = new CloseWidgetsInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseWidgetsInCtx getCloseWidgetsInCtx() {
            return new CloseWidgetsInCtx();
    }
     public class CloseWidgetsOutCtx implements Cloneable {
     Sqlca sqlca = UhdynsqlCtx.this.getSqlca();
     Work work = UhdynsqlCtx.this.getWork();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public UhdynsqlCtx getUhdynsqlCtx() {
            return UhdynsqlCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseWidgetsOutCtx clone() {
        CloseWidgetsOutCtx cloneObj = new CloseWidgetsOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseWidgetsOutCtx getCloseWidgetsOutCtx() {
            return new CloseWidgetsOutCtx();
    }
}
