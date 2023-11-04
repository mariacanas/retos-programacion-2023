

 
    function pseudoRandom(){
        let start = performance.now();
        let end = performance.now();
        let duration = Math.round((end - start)*1000);

        if(duration >= 0  && duration <=100){
            return duration;
        }
        else return -1;

    }


  

    console.log(pseudoRandom());

    