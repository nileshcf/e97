package com.cloudframe.app.uhdynsql.dto;

/**
*  The class WqSqlFullClause is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WqSqlFullClause extends WqSqlFullClauseSerialized {
   

								@Getter @Setter private short wqSqlFullClauseLen;

						@Getter @Setter private char[] wqSqlFullClauseText = Field.fillLowValue(7000);
	
	/**
	* Constructor for WqSqlFullClause
	**/
    public WqSqlFullClause() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes WqSqlFullClause
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setWqSqlFullClauseLen((short)0);
         setWqSqlFullClauseText(CONSTANTS.SPACE_7000);
   }


}
  
