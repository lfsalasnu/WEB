let pantalla=document.getElementById('pantalla');
const botones=document.querySelectorAll('#botones a');

for(const boton of botones){
    boton.addEventListener('click',function(e){
        e.preventDefault();
        if(e.target.dataset.key=='equal'){
            pantalla.innerHTML=eval(pantalla.innerHTML);
        }
        else if(e.target.dataset.key=='Clear'){
            pantalla.innerHTML="";
        }
        else{
            //pantalla.innerHTML+=e.target.dataset.key;
            alert(e.target.dataset.key);
        }


    }
    );
}

function funcion_0(){
    pantalla.innerHTML+='0';
}

function funcion_1(){
    pantalla.innerHTML+='1';
}

function funcion_2(){
    pantalla.innerHTML+='2';
}

function funcion_3(){
    pantalla.innerHTML+='3';
}

function funcion_4(){
    pantalla.innerHTML+='4';
}

function funcion_5(){
    pantalla.innerHTML+='5';
}

function funcion_6(){
    pantalla.innerHTML+='6';
}

function funcion_7(){
    pantalla.innerHTML+='7';
}

function funcion_8(){
    pantalla.innerHTML+='8';
}

function funcion_9(){
    pantalla.innerHTML+='9';
}

function funcion_mas(){
    pantalla.innerHTML+='+';
}

function funcion_menos(){
    pantalla.innerHTML+='-';
}

function funcion_por(){
    pantalla.innerHTML+='*';
}

function funcion_entre(){
    pantalla.innerHTML+='/';
}

function funcion_punto(){
    pantalla.innerHTML+='.';
}

function funcion_borrar(){
    pantalla.innerHTML='';
}

function igual(){
    pantalla.innerHTML=eval(pantalla.innerHTML);
    if(pantalla.innerHTML.length>8){
        pantalla.innerHTML=eval(pantalla.innerHTML).toFixed(8);
    }
}