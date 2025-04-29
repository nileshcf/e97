package com.cloudframe.app.uhdynsql.dto;

/**
*  The class SqlFilter is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SqlFilter extends SqlFilterSerialized {
   
				@Getter @Setter private SqlFilterColor1Group sqlFilterColor1Group = new SqlFilterColor1Group();
				@Getter @Setter private SqlFilterColor2Group sqlFilterColor2Group = new SqlFilterColor2Group();
				@Getter @Setter private SqlFilterSupplierGroup sqlFilterSupplierGroup = new SqlFilterSupplierGroup();
	
	/**
	* Constructor for SqlFilter
	**/
    public SqlFilter() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSqlFilterColor1Group().setParent(this,getStartOffset() + 0);
					getSqlFilterColor2Group().setParent(this,getStartOffset() + 7);
					getSqlFilterSupplierGroup().setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }





}
  
