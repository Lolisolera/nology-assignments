import '../styles/styles.scss';

let numberOfKeys = document.querySelectorAll(".key").length;

for (let i = 0; i < numberOfKeys; i++) {

  document.querySelectorAll(".key")[i].addEventListener("click", function (this: HTMLElement) {
    let buttonInnerText = this.innerText; // Now TypeScript knows 'this' is an HTMLElement
    makeSound(buttonInnerText);
    buttonAnimation(buttonInnerText);
  });

}

// Listen for keydown event
document.addEventListener("keydown", (event: KeyboardEvent) => { //document.addEventListener("keydown", function (event) {
  makeSound(event.key);
  buttonAnimation(event.key);
});

// Function to play sound based on key pressed (keydown)
function makeSound(key: string): void {//void indicates that the function won't return anything when called.
  //the purpose of this function is purely play sounds and not to return a value.
  switch (key) {
    case "C":
      new Audio("./sounds/cSound.mp3").play();
      break;

    case "D":
      new Audio("./sounds/dSound.mp3").play();
      break;

    case "E":
      new Audio("./sounds/eSound.mp3").play();
      break;

    case "F":
      new Audio("./sounds/fSound.mp3").play();
      break;

    case "G":
      new Audio("./sounds/gSound.mp3").play();
      break;

    case "A":
      new Audio("./sounds/aSound.mp3").play();
      break;

    case "B":
      new Audio("./sounds/bSound.mp3").play();
      break;

    case "C2":
      new Audio("./sounds/c2Sound.mp3").play();
      break;

    case "C#":
      new Audio("./sounds/c_sharpSound.mp3").play();
      break;

    case "D#":
      new Audio("./sounds/d_sharpSound.mp3").play();
      break;

    case "F#":
      new Audio("./sounds/f_sharpSound.mp3").play();
      break;

    case "G#":
      new Audio("./sounds/g_sharpSound.mp3").play();
      break;

    case "A#":
      new Audio("./sounds/a_sharpSound.mp3").play();
      break;

    default:
      console.log(`Sound not found for key: ${key}`);
  }
}

// Function to animate the button when pressed
function buttonAnimation(currentKey: string): void {
  const activeButton = document.querySelector(`.${currentKey}`) as HTMLElement;

  if (activeButton) {
    activeButton.classList.add("pressed");

    setTimeout(() => {
      activeButton.classList.remove("pressed");
    }, 100);// after one second
  } else {
    console.error(`No button found for key: ${currentKey}`);
  }
}
