function validateForm() {

	var bookName = document.getElementById("bname").value;

	if (bookName == null || bookName == "") {
		document.getElementById("bookNameMsg").innerHTML = "Please Enter Book Name";
		return false;
	}else{
		document.getElementById("bookNameMsg").innerHTML = "";
	}

	var bookPrice = document.getElementById("bookPriceMsg").value;
	if (bookPrice == null || isbn == "") {
		document.getElementById("bookPriceMsg").innerHTML = "Please Enter Book Price";
		return false;
	}else{
		document.getElementById("bookPriceMsg").innerHTML = "";
	}
	var bookAuthor = document.getElementById("bookAuthorMsg").value;
	if (price == null || price == "") {
		document.getElementById("bookAuthorMsg").innerHTML = "Please Enter Book Author";
		return false;
	}else{
		document.getElementById("bookAuthorMsg").innerHTML = "";
	}

	return true;

}