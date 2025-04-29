package com.cloudframe.app.uhdynsql.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] wfWidgetsFlag = Field.fillLowValue(1);

								@Getter @Setter private char[] sqlcodeDisp = Field.fillLowValue(4);

						@Getter @Setter private char[] wqSqlColorPred = new char[35];

						@Getter @Setter private char[] wqSqlSupplierPred = new char[35];

						@Getter @Setter private char[] wqSqlSelectClause = Field.fillLowValue(200);

						@Getter @Setter private char[] wqSqlFromClause = Field.fillLowValue(50);

						@Getter @Setter private char[] wqSqlPredicateClause = Field.fillLowValue(200);

						@Getter @Setter private char[] wqSqlOrderByClause = new char[25];
	
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





}
  
