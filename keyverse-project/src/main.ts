import '../styles/styles.scss';

let numberOfKeys = document.querySelectorAll(".key").length;

for (let i = 0; i < numberOfKeys; i++) {

  document.querySelectorAll(".key")[i].addEventListener("click", function (this: HTMLElement) {
    let buttonInnerText = this.innerText; // Now TypeScript knows 'this' is an HTMLElement
    makeSound(buttonInnerText);
    buttonAnimation(buttonInnerText);
  });


}

document.addEventListener("keydown", function (event) {

  makeSound(event.key);

  buttonAnimation(event.key);

});


function makeSound(key: string) {

  switch (key) {
    case "C":
      let cSound = new Audio("./sounds/cSound.mp3");
      cSound.play();
      break;

    case "D":
      let dSound = new Audio("./sounds/dSound.mp3");
      dSound.play();
      break;

    case "E":
      let eSound = new Audio("./sounds/eSound.mp3");
      eSound.play();
      break;

    case "F":
      let fSound = new Audio("./sounds/fSound.mp3");
      fSound.play();
      break;

    case "G":
      let gSound = new Audio("./sounds/gSound.mp3");
      gSound.play();
      break;

    case "A":
      let aSound = new Audio("./sounds/aSound.mp3");
      aSound.play();
      break;

    case "B":
      let bSound = new Audio("./sounds/bSound.mp3");
      bSound.play();
      break;

    case "C2":
      let c2Sound = new Audio("./sounds/c2Sound.mp3");
      c2Sound.play();
      break;

    //mapping sounds to black keys

    case "C#":
      let c_sharpSound = new Audio("./sounds/c_sharpSound.mp3");
      c_sharpSound.play();
      break;

    case "D#":
      let d_sharpSound = new Audio("./sounds/d_sharpSound.mp3");
      d_sharpSound.play();
      break;

    case "F#":
      let f_sharpSound = new Audio("./sounds/f_sharpSound.mp3");
      f_sharpSound.play();
      break;

    case "G#":
      let g_sharpSound = new Audio("./sounds/g_sharpSound.mp3");
      g_sharpSound.play();
      break;

    case "A#":
      let a_sharpSound = new Audio("./sounds/a_sharpSound.mp3");
      a_sharpSound.play();
      break;



    default: console.log(key);

  }
}


function buttonAnimation(currentKey: string) {
  const activeButton = document.querySelector(`.${currentKey}`) as HTMLElement; // Cast to HTMLElement

  if (activeButton) { // Check if activeButton exists
    activeButton.classList.add("pressed");

    setTimeout(function () {
      activeButton.classList.remove("pressed");
    }, 100);
  } else {
    console.error(`No button found for key: ${currentKey}`);
  }
}


