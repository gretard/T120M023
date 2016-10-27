## Loadrunner sample scripts ##

### Register ###
	lr_save_timestamp("tstamp", "DIGITS=12", LAST );
	lr_start_transaction("Register");
	web_submit_data("Registration", 
		"Action=http://localhost:19467/api/Registration", 
		"Method=POST", 
		"RecContentType=application/json", 
		"Referer=http://localhost:19467/Register/Create", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		"EncodeAtSign=YES", 
		ITEMDATA, 
		"Name=name", "Value=test", ENDITEM, 
		"Name=email", "Value=ttt@test-{tstamp}.com", ENDITEM, 
		LAST);
	lr_end_transaction("Register", LR_AUTO);

### Clear ###

	lr_start_transaction("Clear");
	web_url("Clear", 
		"URL=http://localhost:19467/Register/Clear", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:19467/Register/Create", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		LAST);
	lr_end_transaction("Clear", LR_AUTO);
