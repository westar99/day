//player
    // 아이템 : 포켓몬볼, 몬스터볼
    // 전투
//포켓몬   레벨, 경험치, 스킬

let pokemon1 = {
    name : '피카츄',
    atk : 10,
    def : 3,
    maxhp : 100,
    hp : 100,
    attack : function(enemy){
        console.log(`${this.name}가 ${enemy.name}을 ${this.atk}의 데미지로 공격합니다.`);
        enemy.hp = enemy.hp - (this.atk - enemy.def);
        console.log(`${enemy.name}의 체력이 ${enemy.hp}가 되었습니다.`)
    },
    intro : function(){
        console.log('피카 피카아~~');
    }
}
let pokemon2 = {
    name : '롱스톤',
    atk : 7,
    def : 7,
    maxhp : 300,
    hp : 300,
    attack : function(enemy){
        console.log(`${this.name}가 ${enemy.name}을 ${this.atk}의 데미지로 공격합니다.`);
        enemy.hp = enemy.hp - (this.atk - enemy.def);
        console.log(`${enemy.name}의 체력이 ${enemy.hp}가 되었습니다.`)
    },
    intro : function(){
        console.log('무쇠 무쇠~~');
    },
    finish : function(enemy){
        console.log("피니쉬 기술을 사용합니다.");
        if(enemy.hp < enemy.maxhp/10){
            enemy.hp = 0;
            console.log("피니쉬 작렬");
            console.log(`${enemy.name} 이 전투불능 상태가 되었습니다.`);
        }
    }
}


let cat ={
    name : '뮤',
    age : 4,
    gender : '수컷',
    weight : 8,
    height : 50,
    character : '앙칼짐',
    like : '높은곳',

    walk : function(){
        console.log("걷습니다.");
    },
    jump : function(){
        console.log("점프를 합니다.");
    },
    eat : function(meal){
        console.log(meal+"을 먹습니다.");
    },
    cry : function(){
        console.log('냐아아오옹');
    }
}

// cat.cry();
// console.log (cat.age);

// pokemon1.attack(pokemon2);

// 롱스톤은 finish 라는 기술이 있다.
// finish는 적의 체력이 원래체력의 10%이하일때  적의체력을 0으로만드는 기술이다.
// 피카츄의 체력을 깎은다음 finish로 마무리 지어보세요.
// for(let i=0; i<22; i++){
//     pokemon2.attack(pokemon1);
// }
// pokemon2.finish(pokemon1);  //안먹혀야 정상
// pokemon2.attack(pokemon1);
// pokemon2.finish(pokemon1);  //먹혀야 정상


//생성자함수 = 객체를 생성할때 사용되는 함수
//생긴건 함수인데 변수가 있네? 자바스크립트는 함수가 일급객체이기 때문에 가능하다.
function PokeMon(name, type, atk, def, maxhp, sound){
    this.name = name;
    this.type = type;
    this.atk = atk;
    this.def = def;
    this.maxhp = maxhp;
    this.hp = maxhp;
    this.attack = function(enemy){
        console.log(`${this.name}가 ${enemy.name}을 ${this.atk}의 데미지로 공격합니다.`);
        setBuffNuff(this, enemy);
        enemy.hp = enemy.hp - (this.atk - enemy.def);
        console.log(`${enemy.name}의 체력이 ${enemy.hp}가 되었습니다.`)
    }
    this.intro = function(){
        console.log(sound);
    }
    this.checkType = function(enemy){
        let result;
        switch(this.type){
            case "땅":
                break;
            case "불":
                if(enemy.type=="풀")
                    result = "좋음";
                else if(enemy.type =="물")
                    result = "나쁨";
                break;
            case "물":
                if(enemy.type=="불")
                    result = "좋음";
                else if(enemy.type =="풀")
                    result = "나쁨"; 
                break;
            case "풀":
                break;
            case "전기":
                if(enemy.type=="물")
                    result = "좋음";
                else if(enemy.type =="땅")
                    result = "나쁨"; 
                break;
        }
        console.log(`${this.name}와 ${enemy.name}의 상성은...${result}`)
        return result;
    }
}
let pickachu = new PokeMon("피카츄", "전기", 25, 5, 100, "피카 피카아~~");
let fiery = new PokeMon("파이리", "불", 25, 4, 120, "불 불불불");
let weirdSee = new PokeMon("이상해씨", "풀", 20, 7, 110, "이상이상한 이상해씨");
let longStone = new PokeMon("롱스톤", "땅", 20, 10, 200, "돌의 배열로 이루어진 롱스톤");
let ggobugi = new PokeMon("꼬부기", "물", 20, 10, 100, "꼬부기는 입으로 물총을 쏘지");
//fiery.intro();
//pickachu.intro();
//fiery.attack(pickachu);


fiery.진화 = function(){
    console.log("리자몽으로 진화");
}
//fiery.진화();



function setBuffNuff(playerPokemon, AIPokemon){
    let 상성 = playerPokemon.checkType(AIPokemon);
    if(상성=="좋음"){
        console.log("상성이 좋으므로 데미지가 30% 증가합니다.");
        playerPokemon.atk = 1.3 * playerPokemon.atk;
        console.log("바뀐데미지 : "+playerPokemon.atk);
    }else if(상성 == "나쁨"){
        console.log("상성이 나쁘므로 데미지가 30% 감소합니다.");
        playerPokemon.atk = 0.7 * playerPokemon.atk;
        console.log("바뀐데미지 : "+playerPokemon.atk);
    }
}

fiery.attack(ggobugi);
pickachu.attack(ggobugi);