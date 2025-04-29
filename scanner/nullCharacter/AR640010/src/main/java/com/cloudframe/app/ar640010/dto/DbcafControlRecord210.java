package com.cloudframe.app.ar640010.dto;

/**
*  The class DbcafControlRecord210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DbcafControlRecord210 extends DbcafControlRecord210Serialized {
   

						@Getter @Setter private char[] dbcafControlDbid210 = new char[8];


						@Getter @Setter private char[] dbcafControlDbpkg210 = new char[16];


						@Getter @Setter private char[] dbcafControlHlqid210 = new char[4];


						@Getter @Setter private char[] dbcafControlMgosDbpkg210 = new char[18];


						@Getter @Setter private char[] dbcafControlMgosDbid210 = new char[8];

	
	/**
	* Constructor for DbcafControlRecord210
	**/
    public DbcafControlRecord210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDbcafControlDbid210(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 8
             ,1
             );
								setDbcafControlDbpkg210(fillSpace(16));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 25
             ,1
             );
								setDbcafControlHlqid210(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 30
             ,1
             );
								setDbcafControlMgosDbpkg210(fillSpace(18));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 49
             ,1
             );
								setDbcafControlMgosDbid210(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(22)
             , getStartOffset() + 58
             ,22
             );
    }





}
  
