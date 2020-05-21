package hello

import (
	"fmt"
	"net/http"
)

func HelloWorld(w http.ResponseWriter, r *http.Request) {
	fmt.Fprint(w, "hello, world")
}
