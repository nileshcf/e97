package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SortKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SortKey extends SortKeySerialized {
   

						@Getter @Setter private char[] sortDdrKey = new char[10];

						@Getter @Setter private char[] sortBatchKey = new char[10];

						@Getter @Setter private char[] sortExtCapXptId = new char[16];

						@Getter @Setter private char[] sortDsrvId = new char[4];

						@Getter @Setter private char[] sortField3 = new char[30];

						@Getter @Setter private char[] sortField1 = new char[30];
	
	/**
	* Constructor for SortKey
	**/
    public SortKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSortDdrKey(fillSpace(10));
								setSortBatchKey(fillSpace(10));
								setSortExtCapXptId(fillSpace(16));
								setSortDsrvId(fillSpace(4));
								setSortField3(fillSpace(30));
								setSortField1(fillSpace(30));
    }





}
  
